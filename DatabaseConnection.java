package com.hrc.milestone;

import java.sql.*;

public class DatabaseConnection {

	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException 
	{ 
		String dbDriver = "com.mysql.cj.jdbc.Driver"; 
		String dbURL = "jdbc:mysql:// localhost:3306/"; 
		String dbName = "h2h_internship"; 
		String dbUsername = "root"; 
		String dbPassword = "sdpa78e2";
		Class.forName(dbDriver); 
		Connection con = DriverManager.getConnection(dbURL + dbName, dbUsername,  dbPassword); 
		return con; 
	} 

}
