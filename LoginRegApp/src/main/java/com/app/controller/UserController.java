package com.app.controller;

import com.app.model.Login;
import com.app.model.USer;
import com.app.service.LoginService;
import com.app.service.request.LoginRequest;
import com.app.service.request.RegisterRequest;

public class UserController {
	public static USer getregister() throws Exception {
		// TODO Auto-generated method stub
		USer user= new RegisterRequest().register();
		return LoginService.userRegister(user);
		
	}
	public static String getlogin() throws Exception {
		// TODO Auto-generated method stub
		Login log= new LoginRequest().userLogin();
		return LoginService.userLogin(log);
	}

	
}
