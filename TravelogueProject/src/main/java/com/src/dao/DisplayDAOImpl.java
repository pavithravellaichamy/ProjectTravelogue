package com.src.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.Suggestion;

@Repository
public class DisplayDAOImpl implements DisplayDAO
{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Suggestion> getAllSuggestion() 
	{
		return sessionFactory.getCurrentSession().createQuery("from Suggestion").list();
	}
}


