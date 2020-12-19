package com.src.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserLoginDAOImpl implements UserLoginDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean validate(String username, String password) 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from UserRegistration where username=:username and password=:password");
		
		query.setParameter("username", username);
		query.setParameter("password", password);
		
		List list=query.list();
		
		boolean b=list.isEmpty();
		
		if(!b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
