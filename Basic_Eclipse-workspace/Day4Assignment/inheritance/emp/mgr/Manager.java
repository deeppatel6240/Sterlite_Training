/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package inheritance.emp.mgr;

//import class from package inheritance.emp
import inheritance.emp.Employee;

//sub class of Employee class
public class Manager extends Employee{
	
	//private data member
	private double incentives;
	
	//default constructor
	public Manager() {
		
		//initialization 
		incentives = 15000.52;
	}
	
	//parameterized constructor
	public Manager(int empId, String name, double salary, double incentives) {
		super(102, "Dhruv", 20000);
		this.incentives = incentives;
	}
	
	//member method
	public void showIncentives() {
		System.out.println("This is all details display by showIncentives method\n");
		System.out.println("******************************************************\n");
		System.out.println("Employee's incentives is :" + incentives + "\n\n");		
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