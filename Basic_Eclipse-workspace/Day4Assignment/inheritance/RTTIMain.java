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

// this is my RTTIMain class
public class RTTIMain {

	public static void showEmpInfo(Employee emp) {
		
		if (emp instanceof Manager) {
			((Manager) emp).display();
			
			((Manager) emp).showIncentives();
			
		}
		
		if (emp instanceof WageEmp) {
			
			((WageEmp) emp).calculateWage();
		}
	}
	
	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of Manager
		Manager obj = new Manager(0, null, 0, 14700);
		
		//invoking showEmpInfo method using object
		showEmpInfo(obj);
		
		//object of Manager
		WageEmp obj2 = new WageEmp(0, null, 20, 1400);
				
		//invoking showEmpInfo method using object
		showEmpInfo(obj2);
	}

}
// end of the class
