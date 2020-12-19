package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.UserLoginDAO;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserLoginDAO loginDAO;
	
	@Override
	public boolean validate(String username, String password) 
	{
		return loginDAO.validate(username, password);
	}

}
