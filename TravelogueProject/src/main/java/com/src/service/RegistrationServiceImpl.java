package com.src.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.RegistrationDAO;
import com.src.model.UserRegistration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService
{
	@Autowired
	private RegistrationDAO registerDAO;

	@Override
	@Transactional
	public void registerUsers(UserRegistration user) 
	{
		registerDAO.registerUsers(user);	
	}
	public void setRegistrationDAO( RegistrationDAO registerDAO)
	{
		this.registerDAO=registerDAO;
	
	}
}
