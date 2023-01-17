package com.app.controller;

import com.app.model.Login;
import com.app.service.LoginService;
import com.app.service.request.LoginRequest;

public class LoginController {
		public static String login(Login login) throws Exception {
		// TODO Auto-generated method stub
		String user=LoginService.userLogin(login);
		return user;
	}

}
