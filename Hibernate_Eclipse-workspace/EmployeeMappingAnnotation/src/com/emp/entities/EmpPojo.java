package com.emp.entities;
/*
 * @Description
 * 		// It is a POJO class which acts as Persistent class 
 * 		or ENtity class in Hibernate. 
 * 		It uses JPA annotations.//
 * 
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRACTICE_EMP")
public class EmpPojo {

	// instance of class
	@Id
	@Column(name = "EMPLOYEE_ID")
	private int id;
	
	@Column(name = "FIRST_NAME")
	private String fName;
	
	@Column(name = "LAST_NAME")
	private String lName;

	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private long phoneNo;
	
	@Column(name = "MANAGER_ID")
	private int managerId;
	
	@Column(name = "DEPARTMENT_NAME")
	private String departName;

	// default constructor
	public EmpPojo() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public EmpPojo(int id, String fName, String lName, String email, long phoneNo, int managerId, String departName) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.managerId = managerId;
		this.departName = departName;
	}

	// getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "EmpPojo [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", phoneNo="
				+ phoneNo + ", managerId=" + managerId + ", DepartName=" + departName + "]";
	}

}
