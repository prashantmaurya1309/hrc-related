package com.trial.hrc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class ServletBtoUI extends HttpServlet
{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/prashant";

	static final String USER = "root";
	static final String PASS = "sdpa78e2";
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		Connection con = null;
		java.sql.Statement st = null;
		
		try {
			//DriverManager.registerDriver(new Driver());
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			
			st = con.createStatement();
			String sql1;
			sql1 = "SELECT * FROM assignment1";
			//sql2 = "SELECT alias,quote FROM assignment1 WHERE serial = 112";
			ResultSet rs = st.executeQuery(sql1);
			//Creating an ArrayList object
			 ArrayList<FinalPojo> assignment1List = new ArrayList<>();
			while(rs.next()){
				//Retrieve by column name
				FinalPojo apObj = new FinalPojo();
				apObj.setFirst_Name(rs.getString("First_Name"));
				apObj.setLast_Name(rs.getString("Last_Name"));
				apObj.setSerial(rs.getInt("Serial"));
				apObj.setAlias(rs.getString("Alias"));
				apObj.setQuote(rs.getString("Quote"));
				//adding object in the list of object

				assignment1List.add(apObj);
				
				}
			

			Gson gson = new Gson();
			String res_data = gson.toJson(assignment1List);
			//System.out.println(res_data);
			
			
			PrintWriter out=res.getWriter();
			out.println(res_data);
			
			rs.close();
			st.close();
			con.close();
			}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
			}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
			}finally{
			//finally block used to close resources
			try{
			if(st!=null)
			st.close();
			}catch(SQLException se2){
			}// nothing we can do
			try{
			if(con!=null)
			con.close();
			}catch(SQLException se){
			se.printStackTrace();
			}
			}
			System.out.println("Goodbye!");
		
	}
		
		
		
	}


