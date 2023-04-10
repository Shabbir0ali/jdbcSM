package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataInJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shabbir","root","root");
		
		
		String q = "insert into rehan (Rname,Rcity) values(?,?)";
//		String q = "delete from rehan where Rid = ?";
		PreparedStatement stmt = con.prepareStatement(q);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		String name = br.readLine();
		System.out.println("Enter city");
		String city = br.readLine();
		
		stmt.setString(1, name);
		stmt.setString(2, city);
//		stmt.setInt(1,9);
		stmt.executeUpdate();
		con.close();
		
		System.out.println("Inserted");
	}
}