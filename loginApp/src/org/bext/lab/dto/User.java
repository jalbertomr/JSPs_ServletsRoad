package org.bext.lab.dto;

public class User {
	String userName;
	String userId;
	
	public String getUserName() {
		System.out.println("user getUserName: "  + userName);
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
