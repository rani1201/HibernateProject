package com.app.service.request;

import java.util.Scanner;

import com.app.model.Login;
import com.app.model.USer;

public class RegisterRequest {
	Scanner sn=new Scanner(System.in);
	int id;
	String uname;
	String password;
	public Login loginRequest(int flag) {
		String uname,password,role;
		Login reg=new Login();
		if(flag==1) {
		System.out.println("Please insert Admin Register details...");
		adminReg(reg);
		}
		else if(flag==2){
			System.out.println("Please insert Hotel register details...");
			hotelReg(reg);
		}else {
			System.out.println("Please insert user register details...");
			userReg(reg);
		}
		return reg;
	}
	/**
	 * @param login
	 */
	private void userReg(Login reg) {
		int id;
		String uname;
		String password;
		String role;
		System.out.println("Enter userId: ");
		id=sn.nextInt();
		System.out.println("Enter your Username: ");
		uname=sn.next();
		System.out.println("Enter the password: ");
		password=sn.next();
		System.out.println("Enter the role: ");
		role=sn.next();
		reg.getUid();
		reg.getPassword();
		reg.getUname();
		reg.getRole();
	}
	/**
	 * @param login
	 */
	private void hotelReg(Login reg) {
		String password;
		String role;
		System.out.println("Enter your Hotel id: ");
		int hotelid=sn.nextInt();
		System.out.println("Enter your username: ");
		String uname=sn.next();
		System.out.println("Enter the password: ");
		password=sn.next();
		System.out.println("Enter role: ");
		role=sn.next();
		reg.getUid();
		reg.getUname();
		reg.getPassword();
		reg.getRole();
	}
	/**
	 * @param login
	 */
	private void adminReg(Login reg) {
		int id;
		String uname;
		String password;
		System.out.println("Enter userId: ");
		id=sn.nextInt();
		System.out.println("Enter your Username: ");
		uname=sn.next();
		System.out.println("Enter the password: ");
		password=sn.next();
		System.out.println("Enter role: ");
		String role=sn.next();
		reg.getUid();
		reg.getUname();
		reg.getPassword();
		reg.getRole();
	}
	public USer register() {
	
		System.out.println("Enter userId: ");
		id=sn.nextInt();
		System.out.println("Enter your Username: ");
		uname=sn.next();
		System.out.println("Enter the password: ");
		password=sn.next();
		System.out.println("Enter Salary: ");
		double sal=sn.nextDouble();
		System.out.println("Enter address: ");
		String address=sn.next();
		System.out.println("Enter Mobile: ");
		long mobile=sn.nextLong();
		System.out.println("Enter User type: ");
		String userType=sn.next();
		USer user=new USer();
		user.setAddress(address);
		user.setId(id);
		user.setMobile(mobile);
		user.setPassword(password);
		user.setRole(userType);
		user.setSal(sal);
		user.setUname(uname);
		return user;
		
		
	}
}
