package com.studentManagementApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionProviderForStudent {

	static Connection con ;

	static Connection getconnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "root");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return con;

	}
}
