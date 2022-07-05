package com.daoimpl;

import java.sql.PreparedStatement;

import com.dao.EmployeeIntf;
import com.model.Employee;

public class Employeeimpl implements EmployeeIntf{
	int row = 0;
	@override
	public int save(Object object) {
		Employee e1 = (Employee) object;
		DBConnection db = new DBConnection();
		try {
		PreparedStatement ps = db.getConnection().prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1, e1.getEmp_id());
		ps.setString(2, e1.getE_name());
		ps.setDouble(3, e1.getE_sal());
		row = ps.executeUpdate();
		}catch (Exception e) {e.printStackTrace();}
		return row;
	}		
}
	

