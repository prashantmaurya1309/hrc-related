package com.higradius;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdba {
	



	
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost/sakila";
		
		static final String USER = "root";
		static final String PASS = "sdpa78e2";
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Connection con = null;
			java.sql.Statement st = null;
			try {
				//DriverManager.registerDriver(new Driver());
				Class.forName("com.mysql.cj.jdbc.Driver");

				
				con = DriverManager.getConnection(DB_URL,USER,PASS);
				
				st = con.createStatement();
				String sql;
				sql = "SELECT actor_id,first_name FROM actor";
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()){
					//Retrieve by column name
					int actor_id = rs.getInt("actor_id");
					String first = rs.getString("first_name");
					//Display values
					System.out.println("ID: " + actor_id);
					System.out.println(", First: " + first);
					}
					//STEP 6: Clean-up environment
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



