package com.lti.training.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Saurav Sanyal
 * @version 1.0
 */

public class StudentDao {
	
	/*
	 * Function to add a student record into the table.
	 */
	public void addStudent (Student student, int rn, String fn, String ln, String co, String re) {
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "hr";
			String pass = "hr";
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);
			String query = "insert into tablestudent values(?,?,?,?,?)";
			statement = connection.prepareStatement(query);
			
			statement.setInt(1, rn);
			statement.setString(2, fn);
			statement.setString(3, ln);
			statement.setString(4, co);
			statement.setString(5, re);
			statement.executeUpdate();
			System.out.println("Record inserted successfully!");
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
	
	public Student searchStudent(int rn) {

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
			statement.setInt(1, rn);
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
	
	public void delStudent(int rn) {
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
			statement.setInt(1, rn);
			resultset = statement.executeQuery();
			System.out.println("The record of the student has been deleted.");
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
	
	public List<Student> fetchFailure() {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultset = null ;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "hr";
			String pass = "hr";
			connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);                                              
			String query = "select * from tablestudent where result = 'Fail'";
			statement = connection.prepareStatement(query);
			resultset = statement.executeQuery();
			
			List<Student> students = new ArrayList<Student>();
			while(resultset.next()) {
				Student s=new Student();
				s.setRollno(resultset.getInt(1));
				s.setFname(resultset.getString(2));
				s.setLname(resultset.getString(3));
				s.setCourse(resultset.getString(4));
				s.setResult(resultset.getString(5));
				students.add(s);
			}
			return students;
		}
		
		catch(ClassNotFoundException e) {
			System.out.println("JDBC driver not found");
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try { connection.close(); } catch(Exception e) { }
		}
		return null; // bad 
		}
	
}
