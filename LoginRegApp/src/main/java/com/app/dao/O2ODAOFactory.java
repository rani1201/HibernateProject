package com.app.dao;

public class O2ODAOFactory {
	public static O2ODAO getInstance() 
	{
			return new O2ODAOImpl();
	}
}
