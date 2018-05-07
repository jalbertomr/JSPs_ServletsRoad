package org.bext.lab;

import java.util.HashMap;

import org.bext.lab.dto.User;

public class LoginService {
	HashMap<String,String> users = new HashMap<String,String>();
	
	public LoginService() {
		users.put("juan", "Juan Perez");
		users.put("luis","Luis Camacho");
		users.put("maria", "Maria Nina");
	}

	public boolean authenticate(String userId, String password){
		if (password == null || password.trim() == ""){
			return false;
		}
		return true;
	}
	
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
