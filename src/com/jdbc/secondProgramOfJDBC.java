package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class secondProgramOfJDBC {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shabbir","root","root");
			Statement createStatement = con.createStatement();
			createStatement.executeQuery("select * from jdbc");
			ResultSet set = createStatement.getResultSet();
			while(set.next()) {
				String string = set.getString("id");
				System.out.println(string);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
