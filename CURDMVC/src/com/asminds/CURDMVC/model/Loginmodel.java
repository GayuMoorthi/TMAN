package com.asminds.CURDMVC.model;

public class Loginmodel {

	public String username;
	public String password;
	
	//Getter&Setter
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

	//Constructor with flieds
	public Loginmodel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	//Constructor with flieds without parameter
	public Loginmodel() {
		super();
	}
	
}
