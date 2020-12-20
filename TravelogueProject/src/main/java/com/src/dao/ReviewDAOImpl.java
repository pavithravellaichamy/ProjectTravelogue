package com.src.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.src.model.Suggestion;

@Repository
public class ReviewDAOImpl implements ReviewDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void reviewUpdate(Suggestion suggestion) throws Exception
	{
		sessionFactory.getCurrentSession().saveOrUpdate(suggestion);
	}

}