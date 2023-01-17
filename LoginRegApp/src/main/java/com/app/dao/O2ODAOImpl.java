package com.app.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.model.Login;
import com.app.model.USer;
import com.app.util.HibernateUtil;


public class O2ODAOImpl implements O2ODAO {

	@Override
	public USer insertDataUsingRegister(USer login) {
		// TODO Auto-generated method stub
			Session ses=HibernateUtil.getSession();
			System.out.println("Registered successfully....");
			Transaction tx=null;
			try {
				tx=ses.beginTransaction();
				ses.save(login);
				tx.commit();
			}//try
			catch(Exception e)
			{
				tx.rollback();
				
			}//catch
			return login;
		}

	@Override
	public USer selectDataUsingLogin(Login login) {
			Session ses=HibernateUtil.getSession();
			//Load Objs(parent-child)
			Query query=ses.createQuery("from USer where uname='"+login.getUname()+"' and password='"+login.getPassword()+"'");
			List<USer>list=query.list();
		return list.stream().findFirst().get();
	}
}
