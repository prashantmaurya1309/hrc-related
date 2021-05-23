package com.trial.hrc;

import java.sql.*;

public class DataCon {
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException 
	{ 
		String dbDriver = "com.mysql.cj.jdbc.Driver"; 
		String dbURL = "jdbc:mysql:// localhost:3306/"; 
		String dbName = "prashant"; 
		String dbUsername = "root"; 
		String dbPassword = "sdpa78e2";
		Class.forName(dbDriver); 
		Connection con = DriverManager.getConnection(dbURL + dbName, dbUsername,  dbPassword); 
		return con; 
	} 

}





