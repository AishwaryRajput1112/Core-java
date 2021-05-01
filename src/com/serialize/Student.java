package com.serialize;

import java.io.Serializable;

public class Student implements Serializable {

	private int id;
	private transient String loginPassword;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", loginPassword=" + loginPassword + ", username=" + username + "]";
	}
	
	
	
}
