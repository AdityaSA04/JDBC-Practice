package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Practice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Aditya@1az");
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
			ps.setString(1,"Nitin");
			ps.setInt(2,21);
			ps.setString(1,"Aditya");
			ps.setInt(2, 22);
			ps.setString(1,"Darshit");
			ps.setInt(2, 23);
			ps.setString(1,"Harsh");
			ps.setInt(2, 24);
			int a = ps.executeUpdate();
			}catch(Exception e){
				System.out.println(e);
				
			}
		
	}
}
