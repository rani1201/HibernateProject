package com.app.model;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class USer {
@Id
private int id;
private String uname;
private String password;
private String role;
private String address;
private long mobile;
private double sal;
private String userType;
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "USer [id=" + id + ", uname=" + uname + ", password=" + password + ", role=" + role + ", address=" + address
			+ ", mobile=" + mobile + ", sal=" + sal + ", userType=" + userType + "]";
}
}
