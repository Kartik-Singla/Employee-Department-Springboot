package com.springboot.paytm.userdetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "allrecords")
public class User {
	
	@Id
	String username;
	String password;
	String authorities;
	
	
	public User() {
	}
	public User(String username, String password, String authorities) {
		super();
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	
	
}
