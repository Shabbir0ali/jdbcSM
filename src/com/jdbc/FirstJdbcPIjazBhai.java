
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class FirstJdbcPIjazBhai
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1 - load the Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 - Create connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shabbir","root","root");
		
		String q="insert into JDBC values(2,'rehan','sakinaka','india')";
		//step 3 - create Statement 
		
		Statement stmt = con.createStatement();
		
		
		//step 4 - Execute query
		//stmt.executeUpdate("create table JDBC(ID int(20) primary key,name varchar(50) not null , City varchar(20),Country varchar(20) )");
		stmt.executeUpdate(q);
		System.out.println("Inserted");
		
		//step 5 - colse file
		con.close();
	}
}
