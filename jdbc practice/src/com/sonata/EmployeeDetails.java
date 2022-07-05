package com.sonata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class EmployeeDetails {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Aditya@1az");
		Statement st = c1.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
	
		}
		}catch(ClassNotFoundException e1) {
			System.out.println(e1);
		}catch(SQLException e2) {System.out.println(e2);}
	}
}