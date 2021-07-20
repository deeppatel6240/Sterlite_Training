/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference of super class
		Employee ref1;
		
		//created object of manager class using reference of super class
		ref1 = new Manager(105, "meet", 90000, 3500);
		
		//assigning refManager to ref2 using type casting
		Manager refManager;
		refManager = (Manager)ref1;
		
		//invoking display method
		refManager.display();
		
		//invoking calculateWage method
		refManager.showIncentives();
		
		//reference of super class
		Employee ref2;
		
		//created object of manager class using reference of super class
		ref2 = new WageEmp(0, null, 5, 500);

		// assigning refManager to ref2 using type casting
		WageEmp refWageEmp;
		refWageEmp = (WageEmp)ref2;

		// invoking display method
		refWageEmp.display();

		// invoking calculateWage method
		refWageEmp.calculateWage();
	}

}
//end of the class
