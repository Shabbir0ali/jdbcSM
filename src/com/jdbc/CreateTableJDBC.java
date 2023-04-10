package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableJDBC {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shabbir", "root", "root");

			String q = "create table sakib(Rid int(13) primary key auto_increment , Rname varchar(155) not null,Rcity varchar(100))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("talbe created");
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}