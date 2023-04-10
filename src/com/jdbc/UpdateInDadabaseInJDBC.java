package com.jdbc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateInDadabaseInJDBC
{
	public static void main(String[] args) throws SQLException, IOException {
		
		Connection con = ConnectionProvider.getConnection();
		
		String q = "update rehan set Rname = ? , Rcity = ? where Rid = ?";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a new name:");
		String name = br.readLine();
		System.out.println("Enter a new city:");
		String city = br.readLine();
		System.out.println("Enter a ID:");
		int id = Integer.parseInt(br.readLine());
		
		PreparedStatement stmt = con.prepareStatement(q);
		
		stmt.setString(1, name);
		stmt.setString(2, city);
		stmt.setInt(3, id);
		
		stmt.executeUpdate();
		System.out.println("completed");
		con.close();
	}
}
