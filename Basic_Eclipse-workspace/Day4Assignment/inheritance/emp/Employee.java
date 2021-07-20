/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package inheritance.emp;

//public class Employee which contain employee details
//superclass
public class Employee {
	
	//private data members
	private int empId;
	private String name;
	private double salary;;
	
	//default constructor of Employee class
	public Employee() {
		
		//initialization value of data members
		empId = 101;
		name = "Deep";
		salary = 40000.58;
	}
	
	//parameterized constructor of Employee class
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	//parameterized constructor of Employee class
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	//member function of Employee class
	protected void display() {
		System.out.println("This is all details display by display method\n");
		System.out.println("**********************************************\n");
		System.out.println("Employee Id is :" + empId + "\n" +
							"Employee Name is :" + name + "\n" +
							"Employee salary is :" + salary + "\n\n");	
	}
	
	//member function of Employee class
	public String toString() {
		System.out.println("This is all details display by toString method\n");
		System.out.println("**********************************************\n");
		return "Employee Id is :" + empId + "\n" + 
							"Employee Name is :" + name + "\n" +
							"Employee salary is :" + salary + "\n\n";
	}

}
//end of the class
