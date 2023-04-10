package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OnlyFirstTwoStep {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			/*
			 * String url = "jdbc:mysql://localhost:3306/shabbir"; String id = "root";
			 * String password = "root";
			 */
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shabbir", "root", "root");
			String q = "select * from jdbc";
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(q);

			while(set.next()) {
			int getId = set.getInt("id");
				String getName = set.getString("name");
					String getCity = set.getString("city");
				String getCountry = set.getString("country");
				System.out.println(getId + "   " + getName + "   " + getCity + "   " + getCountry);
			}
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}