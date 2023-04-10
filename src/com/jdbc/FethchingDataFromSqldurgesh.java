package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FethchingDataFromSqldurgesh {

	public static void main(String[] args) throws SQLException {

		Connection con = ConnectionProvider.getConnection();

		String q = "select * from rehan";
		PreparedStatement stmt = con.prepareStatement(q);
		ResultSet set = stmt.executeQuery();

		while (set.next()) {
			int id = set.getInt("Rid");
			String name = set.getString("Rname");
			String city = set.getString("Rcity");
			
			System.out.println(id+"    |  "+name+"   |  "+city);
			
		}
		con.close();
	}
}
