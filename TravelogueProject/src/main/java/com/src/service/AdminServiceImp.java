package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.AdminDAO;
import com.src.model.AdminLogin;

@Service
@Transactional
public class AdminServiceImp implements AdminService {

	@Autowired
	private AdminDAO adminDAO;
	
	@Override
	public boolean validate(AdminLogin login) {
		
		return adminDAO.validate(login);
	}

}
