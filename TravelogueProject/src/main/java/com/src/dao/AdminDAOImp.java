package com.src.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.AdminLogin;

@Repository
public class AdminDAOImp implements AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger= LoggerFactory.getLogger(RegistrationDAOImpl.class);

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
			logger.info("Login is validated");
			return true;
		}
		else
		{
			logger.info("Login is not validated");
			return false;
		}
		}
	}


		
