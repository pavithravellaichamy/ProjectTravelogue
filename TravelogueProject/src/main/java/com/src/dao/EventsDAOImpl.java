package com.src.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.Events;
import com.src.model.UserRegistration;

@Repository
public class EventsDAOImpl implements EventsDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Events> getAllEvents(String username, String spot, String rating)
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Suggestion where username=:username and spot=:spot and rating=:rating");  //validating
		query.setParameter("username", username);
		query.setParameter("spot",spot);
		query.setParameter("rating",rating);
		return query.list();
	}
}
