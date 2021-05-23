//package com.trial.hrc;
//
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import javax.servlet.RequestDispatcher;
//
//import com.google.gson.Gson;
//
//public class BackendToUI {
//	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//	static final String DB_URL = "jdbc:mysql://localhost/prashant";
//
//	static final String USER = "root";
//	static final String PASS = "sdpa78e2";
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Connection con = null;
//		java.sql.Statement st = null;
//		
//		try {
//			//DriverManager.registerDriver(new Driver());
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			
//			con = DriverManager.getConnection(DB_URL,USER,PASS);
//			
//			st = con.createStatement();
//			String sql1;
//			sql1 = "SELECT * FROM assignment1";
//			//sql2 = "SELECT alias,quote FROM assignment1 WHERE serial = 112";
//			ResultSet rs = st.executeQuery(sql1);
//			//Creating an ArrayList object
//			 ArrayList<TrialPOJO> assignment1List = new ArrayList<>();
//			while(rs.next()){
//				//Retrieve by column name
//				TrialPOJO apObj = new TrialPOJO();
//				apObj.setFirst_Name(rs.getString("First_Name"));
//				apObj.setLast_Name(rs.getString("Last_Name"));
//				apObj.setSerial(rs.getInt("Serial"));
//				apObj.setAlias(rs.getString("Alias"));
//				apObj.setQuote(rs.getString("Quote"));
//				//adding object in the list of object
//
//				assignment1List.add(apObj);
//				
//				}
//
//			//Display values
////			for (TrialPOJO obj: assignment1List) {
////				System.out.println("FirstName "+ obj.getFirst_Name());
////				System.out.println("LastName "+ obj.getLast_Name());
////				System.out.println("serial "+ obj.getSerial());
////				System.out.println("Alias "+ obj.getAlias());
////				System.out.println("Quote "+ obj.getQuote());
////				System.out.println();
////				
////			}
//			
////			Gson gson = new Gson();
////		      String res_data = gson.toJson(assignment1List);
////		      TrialPOJO response;
////			PrintWriter out = response.getWriter();
////		      ((TrialPOJO) response).setContentType("application/json");
////		      ((TrialPOJO) response).setCharacterEncoding("UTF-8"); 
////		      out.print(res_data);
////		      out.flush();
//			
//			
//			Gson gson = new Gson();
//			String res_data = gson.toJson(assignment1List);
//			//System.out.println(res_data);
//			RequestDispatcher rd = req.getRequestDispatcher("sq");
//			rd.forward(req, res);
//			 
//		    
//			
//			
//				//STEP 6: Clean-up environment
//				rs.close();
//				st.close();
//				con.close();
//				}catch(SQLException se){
//				//Handle errors for JDBC
//				se.printStackTrace();
//				}catch(Exception e){
//				//Handle errors for Class.forName
//				e.printStackTrace();
//				}finally{
//				//finally block used to close resources
//				try{
//				if(st!=null)
//				st.close();
//				}catch(SQLException se2){
//				}// nothing we can do
//				try{
//				if(con!=null)
//				con.close();
//				}catch(SQLException se){
//				se.printStackTrace();
//				}
//				}
//				System.out.println("Goodbye!");
//			
//		}
//
//}
//
//
//
//
//
//
//
//
