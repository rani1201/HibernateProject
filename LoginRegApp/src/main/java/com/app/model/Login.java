package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
	private int uid;
	private String uname;
	private String password;
	private String role;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [uid=" + uid + ", uname=" + uname + ", password=" + password + ", role=" + role + "]";
	}
	public Login(int uid, String uname, String password, String role) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.role = role;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String uname, String password) {
		// TODO Auto-generated constructor stub
		this.uname = uname;
		this.password = password;
	}
}
