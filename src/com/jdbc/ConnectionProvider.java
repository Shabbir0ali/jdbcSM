package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	private static Connection con;
	
	public static Connection getConnection()
	{
		if(con==null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shabbir","root","root");
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
