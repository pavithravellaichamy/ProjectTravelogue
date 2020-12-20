package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.RegistrationDAO;
import com.src.dao.ReviewDAO;
import com.src.model.Suggestion;
import com.src.model.UserRegistration;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService
{
	@Autowired
	private ReviewDAO reviewDAO;

	@Override
	@Transactional
	public void reviewUpdate(Suggestion suggestion) throws Exception 
	{
		reviewDAO.reviewUpdate(suggestion);
	}
	
	public void  setReviewDAO( ReviewDAO reviewDAO)
	{
		this.reviewDAO=reviewDAO;
	}
		
}
