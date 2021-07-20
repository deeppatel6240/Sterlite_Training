/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package inheritance.emp.wage;

import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;

public class WageEmpData extends EmployeeData {
	public WageEmp getEmployee() {
		return new WageEmp();
	}
}
