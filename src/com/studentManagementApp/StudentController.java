package com.studentManagementApp;

import java.util.Scanner;

public class StudentController {

	public static void main(String[] args) {

		while (true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO UPDATE STUDENT");
			System.out.println("PRESS 5 TO EXIT APP");

			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();

			if (c == 1) {
				System.out.println("Enter user name :");
				String name = sc.next();
				System.out.println("Enter user phone no. :");
				String phone = sc.next();
				System.out.println("Enter user City :");
				String city = sc.next();
				System.out.println("Enter user country :");
				String country = sc.next();
				StudentBean st = new StudentBean(name, phone, city, country);
				
				boolean db = StudentDao.insertIntoStudentDB(st);
				
				if(db) {
					System.out.println("student added succesfully...");
				}
				else {
					System.out.println("someting went wrong try again...");
				}
				System.out.println(st);
						
				
			} else if (c == 2) {
				System.out.println("Enter Student ID to delete data:");
				int userId = sc.nextInt();
				
				boolean db = StudentDao.deleteStudentFromDB(userId);
				if(db) {
					System.out.println("Deleted succesfully....");
				}
				else {
					System.out.println("someting went wrong");
				}
				

			} else if (c == 3) {
				StudentDao.showAllDataFromDB();
			}
			else if(c == 4)
			{
				System.out.println("Enter ID To update a data");
				int a = sc.nextInt();
				boolean db = StudentDao.updateSudentsFromDB(a,sc);
				if(db) {
					System.out.println("Data updated..");
				}
				else {
					System.out.println("sumthing went wrong");
				}
			}
			else if (c == 5) {
				break;
			} else {
				System.out.println("please enter the given the above Numbers only other wise exception dega na bro");
			}
		}
		System.err.println("Thanks you for using our application...");
		System.out.println("see you soon");
	}
}
