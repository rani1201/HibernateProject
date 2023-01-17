package com.app.dao;

import com.app.model.Login;
import com.app.model.USer;

public interface O2ODAO {
	public USer insertDataUsingRegister(USer login);
	public USer selectDataUsingLogin(Login login);
}
		