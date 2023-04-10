package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Statement;

public class RehanJDBC {
	public static void main(String[] args) throws SQLException {
		Scanner src = new Scanner(System.in);
		//int id=src.nextInt();
		String name=src.next();
		String city=src.next();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehan","root","root");
			
			PreparedStatement smt = con.prepareStatement("insert into reh (name,city) values(?,?)");
			smt.setString(1, name);
			smt.setString(2, city);
			
			smt.executeUpdate();
			
			System.out.println("done");
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
