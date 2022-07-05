package com.sonata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
public class getvalue {

	public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Aditya@1az");	
				PreparedStatement ps = con.prepareStatement("insert into employee values(?)");
				ps.setInt(1, 127);
				ResultSet rs = ps.executeQuery("SELECT* from employee WHERE ");
			}catch(Exception e){
				System.out.println(e);
			}
		}


	}

