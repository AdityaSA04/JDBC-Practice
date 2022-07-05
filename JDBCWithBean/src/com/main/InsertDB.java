package com.main;

import com.daoimpl.Employeeimpl;
import com.model.Employee;

public class InsertDB {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmp_id(234);
		e1.setE_name("Roshan");
		e1.setE_sal(35550);
	
		Employeeimpl s1 = new Employeeimpl();
		int a1 = s1.save(e1);
		System.out.println(a1);
	}

}
