package com.app.service.request;

import java.util.Scanner;

import com.app.model.Login;

public class LoginRequest {
	Scanner sn=new Scanner(System.in);
	
	/**
	 * @param login
	 */
	public Login userLogin() {
		String uname;
		String password;
		System.out.println("Enter your Username: ");
		uname=sn.next();
		System.out.println("Enter the password: ");
		password=sn.next();
		return new Login(uname, password);
		}
	/**
	 * @param login
	 */
	private void hotelLogin(Login login) {
		String password;
		System.out.println("Enter your Hotel id: ");
		String hotelid=sn.next();
		System.out.println("Enter the password: ");
		password=sn.next();
		login.setPassword(password);
		login.setUname(hotelid);
		login.setRole("hotel");
	}
	/**
	 * @param login
	 */
	private void adminLogin(Login login) {
		String uname;
		String password;
		System.out.println("Enter your Username: ");
		uname=sn.next();
		System.out.println("Enter the password: ");
		password=sn.next();
		login.setPassword(password);
		login.setUname(uname);
		login.setRole("admin");
	}
}
