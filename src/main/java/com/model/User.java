package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
  private String username;
  
  private String exampleInputEmail1;
  
  private String exampleInputPassword1;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getExampleInputEmail1() {
	return exampleInputEmail1;
}

public void setExampleInputEmail1(String exampleInputEmail1) {
	this.exampleInputEmail1 = exampleInputEmail1;
}

public String getExampleInputPassword1() {
	return exampleInputPassword1;
}

public void setExampleInputPassword1(String exampleInputPassword1) {
	this.exampleInputPassword1 = exampleInputPassword1;
}

@Override
public String toString() {
	return "User [username=" + username + ", exampleInputEmail1=" + exampleInputEmail1 + ", exampleInputPassword1="
			+ exampleInputPassword1 + "]";
}
  
  
}
