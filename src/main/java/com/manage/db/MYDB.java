	package com.manage.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MYDB{

   Connection conn;
   
   
   public Connection getConn(){


		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found !!");
			return conn;
		}
		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/management", "root", "");
			System.out.println("SQL Connection to database established!");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			return conn;
		}
		return connection;
   }
}
