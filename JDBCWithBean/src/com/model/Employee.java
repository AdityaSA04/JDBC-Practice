package com.model;

public class Employee {
	private int emp_id;
	private String e_name;
	private double e_sal;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public double getE_sal() {
		return e_sal;
	}
	public void setE_sal(double e_sal) {
		this.e_sal = e_sal;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", e_name=" + e_name + ", e_sal=" + e_sal + "]";
	}
	
}
