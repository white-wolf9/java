package com.lti.training.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	
	/*
	 * Function to add a student record into the table.
	 */
	public void addStudent (Student student) {
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "hr";
			String pass = "hr";
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);
			String query = "insert into tablestudent values(?,?,?,?,?)";
			statement = connection.prepareStatement(query);
			
			statement.setInt(1, student.getRollno());
			statement.setString(2, student.getFname());
			statement.setString(3, student.getLname());
			statement.setString(4, student.getCourse());
			statement.setString(5, student.getResult());
			statement.executeUpdate();
		}
		catch (ClassNotFoundException e) {
			System.out.println("JDBC driver not found");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}
			catch (Exception e) {
				
			}
		}
	}
	
	public Student searchStudent() {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "hr";
			String pass = "hr";
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);
			String query = "select * from tablestudent where rollno = ?";
			statement = connection.prepareStatement(query);
			statement.setInt(1, 2);
			resultset = statement.executeQuery();
			resultset.next();
			Student s = new Student();
			s.setRollno(resultset.getInt(1));
			s.setFname(resultset.getString(2));
			s.setLname(resultset.getString(3));
			s.setCourse(resultset.getString(4));
			s.setResult(resultset.getString(5));
			
			return s;
		}
		catch (ClassNotFoundException e) {
			System.out.println("JDBC driver not found");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}
			catch (Exception e) {
				
			}
		}
		return null;
	}
	
	public void delStudent() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "hr";
			String pass = "hr";
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);
			String query = "delete from tablestudent where rollno=?";
			statement = connection.prepareStatement(query);
			statement.setInt(1, 3);
			resultset = statement.executeQuery();
		}
		catch (ClassNotFoundException e) {
			System.out.println("JDBC driver not found");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}
			catch (Exception e) {
				
			}
		}
	}
}
