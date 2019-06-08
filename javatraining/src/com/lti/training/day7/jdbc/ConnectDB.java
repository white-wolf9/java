package com.lti.training.day7.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

		public static void main(String[] args) {
				Connection conn=null;
				try {
					//Loading the JDBC Driver
					Class.forName("oracle.jdbc.driver.OracleDriver");
					//Establishing Connection with the database
					String url = "jdbc:oracle:thin:@localhost:1521:XE";
					String user = "hr";
					String pass = "hr";
					conn=DriverManager.getConnection(url,user,pass);
					System.out.println("Connected successfully..");
				}
				catch(ClassNotFoundException e) {
					System.out.println("JDBC driver not found");
				}
				// I just wanna Rollex
				catch(SQLException e) {
					e.printStackTrace();
				}
				
				finally {
					try { conn.close(); } catch(Exception e) { }
				}
		}
}
