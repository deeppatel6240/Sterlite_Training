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

//this is client code used to display all stuff of employee
public class InheritanceMain {

	//main method of InheritanceMain class
	public static void main(String[] args) {
		
		// B
		
		System.out.println("************************************object1**********************************************\n\n\n");
		//object of super class Employee
		Employee ob1 = new Employee(104, "Jeet", 54000);
		//display method 
		//ob1.display();
		//display toString method
		System.out.println(ob1);
		
		// C
		
		System.out.println("************************************object2**********************************************\n\n\n");
		//object of super class Employee
		Manager ob2 = new Manager();
		//display method 
		ob2.showIncentives();
		//display method
		ob2.display();
		//display toString method
		System.out.println(ob2);
		
		// D
		
		System.out.println("************************************object3**********************************************\n\n\n");
		//object of super class Employee
		Manager ob3 = new Manager(0, null, 0, 4200);
		//display method 
		ob3.showIncentives();
		//display method
		ob3.display();
		//display toString method
		System.out.println(ob3);
		
		// E
		
		System.out.println("************************************object4**********************************************\n\n\n");
		// object of super class Employee
		WageEmp ob4 = new WageEmp();
		// display method
		ob4.calculateWage();
		// display method
		ob4.display();
		// display toString method
		System.out.println(ob4);
		
		// E
		
		System.out.println("************************************object5**********************************************\n\n\n");
		// object of super class Employee
		WageEmp ob5 = new WageEmp(0, null, 10, 400);
		// display method
		ob5.calculateWage();
		// display method
		ob5.display();
		// display toString method
		System.out.println(ob5);
			
	}
}
// end of the class