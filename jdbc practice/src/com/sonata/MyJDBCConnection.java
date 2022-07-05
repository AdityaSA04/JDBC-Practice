package com.sonata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class MyJDBCConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Aditya@1az");	
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, 126);
			ps.setString(2, "Darshit");
			ps.setDouble(3, 500);
			ps.setInt(1, 127);
			ps.setString(2, "Aditya");
			ps.setDouble(3, 700);
			int a = ps.executeUpdate();
			System.out.println("The number of records updated are: "+ a);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
