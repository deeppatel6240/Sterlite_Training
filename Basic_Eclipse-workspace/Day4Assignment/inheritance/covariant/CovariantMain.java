/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package inheritance.covariant;

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EmployeeData
		EmployeeData emp1 = new EmployeeData();
		
		emp1.getEmployee();
		
		Employee e = emp1.getEmployee();
		System.out.println(e.toString());
		
		// ManagerData
		ManagerData emp2 = new ManagerData();
		
		emp2.getEmployee();
		
		Manager m = emp2.getEmployee();
		
		System.out.println(m.toString());
		m.showIncentives();
		
		
		// WageEmpData
		WageEmpData emp3 = new WageEmpData();
		
		emp3.getEmployee();
		
		WageEmp w = emp3.getEmployee();
		System.out.println(w.toString());
		w.calculateWage();
		
	}

}
// end of the class
