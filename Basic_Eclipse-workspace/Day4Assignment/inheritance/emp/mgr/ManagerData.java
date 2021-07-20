/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package inheritance.emp.mgr;

import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData{
	public Manager getEmployee() {
		return new Manager();
	}
}
