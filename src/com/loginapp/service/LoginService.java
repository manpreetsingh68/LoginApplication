package com.loginapp.service;

import java.util.HashMap;
import java.util.Map;

import com.loginapp.dto.User;

public class LoginService {
	
	Map<String, String> users = new HashMap<String, String>();
	
	public LoginService() {
		users.put("masingh", "Manpreet Singh");
		users.put("sbhatti", "Sukhpreet Singh Bhatti");
		users.put("iahmad", "Izhar Ahmad");
		
	}
	
	public boolean authentice(String userId, String password) {
		if(password == null || password.trim() == "") {
			return false;
		}
		return true;
	}
	
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}

}
