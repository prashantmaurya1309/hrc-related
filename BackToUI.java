package com.hrc.FinalProj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class BackToUI extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/h2h_internship";

	static final String USER = "root";
	static final String PASS = "sdpa78e2";
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		Connection con = null;
		java.sql.Statement st = null;
		
		try {
			//DriverManager.registerDriver(new Driver());
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			
			st = con.createStatement();
			String sql1;
			sql1 = "SELECT invoice_id,cust_number,name_customer,total_open_amount,due_in_date,notes FROM invoice_details";
			ResultSet rs = st.executeQuery(sql1);
			//Creating an ArrayList object
			 ArrayList<FinalPojo> assignment1List = new ArrayList<>();
			while(rs.next()){
				//Retrieve by column name
				FinalPojo apObj = new FinalPojo();
				
				apObj.setInvoice_id(rs.getString("invoice_id"));
				apObj.setCust_number(rs.getString("cust_number"));
				apObj.setName_customer(rs.getString("name_customer"));
				apObj.setTotal_open_amount(rs.getDouble("total_open_amount"));
				apObj.setDue_in_date(rs.getString("due_in_date"));
				apObj.setNotes(rs.getString("notes"));
				
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
