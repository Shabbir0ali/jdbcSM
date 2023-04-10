package com.studentManagementApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDao {

	
	public static boolean insertIntoStudentDB(StudentBean st)
	{
		 boolean f = false;
		try {
			Connection con = ConnectionProviderForStudent.getconnection();
			PreparedStatement stmt = con.prepareStatement("insert into students(sname,sphone,scity,scountry) values (?,?,?,?)");
			stmt.setString(1,st.getStudentName());
			stmt.setString(2, st.getStudentPhone());
			stmt.setString(3, st.getStudentCity());
			stmt.setString(4, st.getStudentCountry());
			
			stmt.executeUpdate();
			f= true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudentFromDB(int userId) {
		boolean f = false;
		try {
			Connection con = ConnectionProviderForStudent.getconnection();
			PreparedStatement stmt = con.prepareStatement("delete from students where sid = ?");
			stmt.setInt(1, userId);
			stmt.executeUpdate();
			f= true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllDataFromDB() {
	
		
		try {
			Connection con = ConnectionProviderForStudent.getconnection();
			
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery("select * from students");
			System.out.println("Student Detail:");
			while(set.next()) {
				int id = set.getInt("sid");
				String name = set.getString("sname");
				String phone = set.getString("sphone");
				String city = set.getString("scity");
				String country = set.getString("scountry");
				System.out.println("ID     : "+id);
				System.out.println("Name   : "+name);
				System.out.println("phone  : "+phone);
				System.out.println("City   : "+city);
				System.out.println("County : "+country);
				System.out.println("_______________________");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean updateSudentsFromDB(int a, Scanner sc)  {
		Connection con = ConnectionProviderForStudent.getconnection();
		boolean f = false;
		try {
			String update = "update students set sname = ? , sphone = ? , scity = ? , scountry = ? where sid = ?";
			PreparedStatement stmt = con.prepareStatement(update);
			stmt.setInt(5, a);
			System.out.println("Enter a new name :");
			stmt.setString(1,new String(sc.next()));
			System.out.println("Enter a new phone number :");
			stmt.setString(2,new String(sc.next()));
			System.out.println("Enter a new city name :");
			stmt.setString(3,new String(sc.next()));
			System.out.println("Enter a new country name");
			stmt.setString(4,sc.next());
			stmt.executeUpdate();
			f = true;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}
}
