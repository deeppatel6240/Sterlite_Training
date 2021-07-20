/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
package containment.emp;

//import class from containment.date
import containment.date.MyDate;

//this is employee class used to display employee details
public class Employee {
	
	//private data member
	private int empId;
	private String name;
	private MyDate birthDate;
	
	//default constructor
	public Employee() {
		System.out.println("This is my default constructor");
		System.out.println("-------------------------------------\n");
	}
	
	//parameterized constructor
	public Employee(int empId, String name, MyDate birthDate) {
		System.out.println("This is my parameterized constructor");
		System.out.println("-------------------------------------\n");
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	//get method of empid
	public int getEmpId() {
		return empId;
	}

	//set method of empid
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	//get method of name
	public String getName() {
		return name;
	}

	//set method of name
	public void setName(String name) {
		this.name = name;
	}

	//get birth date method
	public MyDate getBirthDate() {
		return birthDate;
	}

	//set birth date method
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	// member method
	public void display() {
		System.out.println("Employee id is :" + empId + "\n" +
				"Employee name is :" + name + "\n" +
				"Employee birthdate is :" + birthDate + "\n");
	}
	
	//second  member method
	public String toString() {
		return "Employee id is :" + empId + "\n" +
				"Employee name is :" + name + "\n" +
				"Employee birthdate is :" + birthDate + "\n";
	}
}
//end of the class
