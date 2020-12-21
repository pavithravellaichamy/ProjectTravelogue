package com.src.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.AdminLogin;

@Repository
public class AdminDAOImp implements AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean validate(AdminLogin login) 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from AdminLogin where username=:username and password=:password");  //validating
		
		query.setParameter("username", login.getUsername());
		query.setParameter("password", login.getPassword());
		
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


		
