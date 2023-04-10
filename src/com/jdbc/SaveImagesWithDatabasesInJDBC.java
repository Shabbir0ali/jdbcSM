package com.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveImagesWithDatabasesInJDBC {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shabbir?sessionVariables=sql_mode='NO_ENGINE_SUBSTITUTION'&jdbcCompliantTruncation=false","root","root");
			
			String q = "insert into IMGTABLE2(image) values(?)";
			PreparedStatement stmt = con.prepareStatement(q);
			//stmt.setString(1, "Shabir");
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\wallpaper.jpg");
			stmt.setBinaryStream(1, fis,fis.available());
			stmt.executeUpdate();
			System.out.println("image set..");
			
			
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
