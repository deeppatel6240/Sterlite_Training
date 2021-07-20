/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
package containment;

import containment.emp.Employee;
import containment.date.MyDate;

public class containmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of Employee class 
		Employee ob1 = new Employee();
		
		//setter method invoking
		ob1.setEmpId(321);
		ob1.setName("Abc");
		ob1.setBirthDate(new MyDate(7, 5, 1854));
		
		//getter method
		ob1.getEmpId();
		ob1.getName();
		ob1.getBirthDate();
		
		//using toString method show all details
		String details = ob1.toString();
		System.out.println(details);
		
		//second object of Employee class
		Employee ob2 = new Employee(112, "Xyz", new MyDate(24, 10, 1999));
		
		//member method of employee class
		ob2.display();
		
	}

}
// end of the class
