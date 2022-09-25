package com.poly.services;

import java.util.List;

import com.poly.dao.UserDao;
import com.poly.model.User;

public class UserService {
private UserDao userDao;
	public UserService() {
		userDao = new UserDao();
	}
	
	public List<User> getUsers() {
		
		return userDao.getAllUser();
		
	}
	
	public User getUserById(int id) {
		
		return userDao.getUserById(id);
		
	}
	
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
}
