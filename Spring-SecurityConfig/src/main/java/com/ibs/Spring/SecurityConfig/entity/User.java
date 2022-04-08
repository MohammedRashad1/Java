package com.ibs.Spring.SecurityConfig.entity;

import javax.persistence.Entity;

@Entity
public class User {

	private String username;
	private String Password;

	public User() {

	}

	public User(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
