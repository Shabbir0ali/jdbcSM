package com.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveBigImageDinamicdugesh {

	public static void main(String[] args) throws SQLException,FileNotFoundException ,IOException  {
		
		Connection con = ConnectionProvider.getConnection();
		
		String q = "insert into images(pic) values(?)";
		
		PreparedStatement stmt = con.prepareStatement(q);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\anime-hunter-x-hunter-gon-css-killua-zoldyck-hd-wallpaper-preview.jpg");
		
		stmt.setBinaryStream(1,fis,fis.available());
		
		stmt.executeUpdate();
		System.out.println("image inserted succesfully bro");
		
		con.close();
	}

}
