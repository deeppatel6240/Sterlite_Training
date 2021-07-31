package com.phoenix.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employees {

	@Id
	@Column(name = "EMPLOYEE_ID")
	private int empId;
	
	@Column(name = "FIRST_NAME")
	private String fName;
	
	@Column(name = "LAST_NAME")
	private String lName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private String pNumber;
	
	@Column(name = "HIRE_DATE")
	private Date hireDate;
	
	@Column(name = "JOB_ID")
	private String jobId;
	
	@Column(name = "SALARY")
	private float salary;
	
	@Column(name = "COMMISSION_PCT")
	private float commPct;
	
	@Column(name = "MANAGER_ID")
	private int managerId;
	
	@Column(name = "DEPARTMENT_ID")
	private int departId;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(int empId, String fName, String lName, String email, String pNumber, Date hireDate, String jobId,
			float salary, float commPct, int managerId, int departId) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pNumber = pNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.commPct = commPct;
		this.managerId = managerId;
		this.departId = departId;
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

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getCommPct() {
		return commPct;
	}

	public void setCommPct(float commPct) {
		this.commPct = commPct;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", pNumber="
				+ pNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary=" + salary + ", commPct="
				+ commPct + ", managerId=" + managerId + ", departId=" + departId + "]";
	}
	
	
}
