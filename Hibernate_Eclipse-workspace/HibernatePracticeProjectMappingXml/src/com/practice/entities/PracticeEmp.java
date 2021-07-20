package com.practice.entities;
/*
 * @Description
 * 		// It is a POJO class which acts as Persistent class 
 * 		or ENtity class in Hibernate. //
 * 
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

// POJO class
public class PracticeEmp {

	// instance of class
	private int empId;
	private String fName;
	private String lName;
	private String email;
	private long phoneNo;
	private int managerId;
	private String departName;

	// default constructor
	public PracticeEmp() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public PracticeEmp(int empId, String fName, String lName, String email, long phoneNo, int managerId,
			String departName) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.managerId = managerId;
		this.departName = departName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Override
	public String toString() {
		return "PracticeEmp [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", managerId=" + managerId + ", departName=" + departName + "]";
	}

	// to string method

} // end of the class
