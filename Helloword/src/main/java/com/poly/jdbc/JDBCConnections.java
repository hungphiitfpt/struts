package com.poly.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnections {
	
	public static Connection getJDBCConnects() {
		   final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
		   final String USER_NAME = "root";
		   final String PASSWORD = "hungphi12a10";
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
