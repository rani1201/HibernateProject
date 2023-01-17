package com.app.service;

import com.app.dao.O2ODAOFactory;
import com.app.model.Login;
import com.app.model.USer;

public class LoginService {

	public static String userLogin(Login login) throws Exception 
	{
		USer loginResponse=O2ODAOFactory.getInstance().selectDataUsingLogin(login);
		return loginResponse.getRole();
	}
	
	public static USer userRegister(USer user) throws Exception 
	{
	return	O2ODAOFactory.getInstance().insertDataUsingRegister(user);
		
	}
}
