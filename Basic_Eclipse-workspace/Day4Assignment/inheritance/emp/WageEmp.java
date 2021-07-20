/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package inheritance.emp;

//sub class of Employee
public class WageEmp extends Employee{
	
	//private data members
	private int noOfHours;
	private float ratePerHour;
	
	//default constructor
	public WageEmp() {
		
		//initialization of data members
		noOfHours = 5;
		ratePerHour = 2000;
	}
	
	//parameterized constructor
	public WageEmp(int empId, String name, int hours, float rate) {
		super(103, "raj", 30000);
		this.noOfHours = hours;
		this.ratePerHour = rate;
	}
	
	//member function
	public void calculateWage() {
		float total = 0;
		total = noOfHours * ratePerHour;
		
		System.out.println("This is all details display by calculateWage method\n");
		System.out.println("****************************************************\n");
		System.out.println("This is total earning of Wage Employee : " + total + "\n\n");
	}
	
	//overridden method display
	public void display() {
		super.display();
	}
	
	//overridden method toString
	public String toString() {
		return super.toString();
	}	
	
}
//end of the class