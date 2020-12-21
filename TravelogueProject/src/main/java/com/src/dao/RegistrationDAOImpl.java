package com.src.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.UserRegistration;

@Repository
public class RegistrationDAOImpl implements RegistrationDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void registerUsers(UserRegistration users)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(users);  //updating to database
	}
}
