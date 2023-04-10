package com.studentManagementApp;

public class StudentBean {

	private int StudentId;
	private String StudentName;
	private String StudentPhone;
	private String StudentCity;
	private String StudentCountry;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentPhone() {
		return StudentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}

	public String getStudentCountry() {
		return StudentCountry;
	}

	public void setStudentCountry(String studentCountry) {
		StudentCountry = studentCountry;
	}

	public StudentBean(int studentId, String studentName, String studentPhone, String studentCity,
			String studentCountry) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
		StudentCountry = studentCountry;
	}

	public StudentBean(String studentName, String studentPhone, String studentCity, String studentCountry) {
		super();
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
		StudentCountry = studentCountry;
	}

	public StudentBean() {
		super();
	}

	@Override
	public String toString() {
		return "StudentBean [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
				+ ", StudentCity=" + StudentCity + ", StudentCountry=" + StudentCountry + "]";
	}
}
