package com.insuranceapp.model;

import java.util.List;

public class AppUser {
	private String userName;
	private Integer userId;
	private String email;
	private String password;
	private List<String> authorities;
	
	public AppUser() {
		super();
	}
	public AppUser(String userName, Integer userId, String email, String password, List<String> authorities) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}
	@Override
	public String toString() {
		return "AppUser [userName=" + userName + ", userId=" + userId + ", email=" + email + ", password=" + password
				+ ", authorities=" + authorities + "]";
	}

	
	
}
