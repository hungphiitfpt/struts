package com.poly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.poly.jdbc.JDBCConnections;
import com.poly.model.User;

public class UserDao {
	public User getUserById(int id) {
		
		String sql = "SELECT * FROM users Where id = ?";
		
		Connection connection = JDBCConnections.getJDBCConnects();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				
				User user = new User();
				
				user.setId(rs.getInt("id"));
				user.setAge(rs.getString("age"));
				user.setName(rs.getString("name"));
				
				return user;
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		String sql = "SELECT * FROM users";
		

		Connection connection = JDBCConnections.getJDBCConnects();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				
				User user = new User();
				
				user.setId(rs.getInt("id"));
				user.setAge(rs.getString("age"));
				user.setName(rs.getString("name"));
				
				return users;
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
public void updateUser(User user) {
		
		Connection connection = JDBCConnections.getJDBCConnects();
		String sql= "UPDATE users SET age = ?, name = ? WHERE id = ? ";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, user.getAge());
			preparedStatement.setString(2, user.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	
	
}
