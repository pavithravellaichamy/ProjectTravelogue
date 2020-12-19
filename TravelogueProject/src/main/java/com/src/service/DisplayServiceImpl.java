package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.DisplayDAO;
import com.src.model.Suggestion;

@Service
@Transactional
public class DisplayServiceImpl implements DisplayService
{
	@Autowired
	private DisplayDAO displayDAO;

	@Override
	public List<Suggestion> getAllSuggestion()
	{
		return displayDAO.getAllSuggestion();
	}
	public void setDisplayDAO(DisplayDAO displayDAO) {
		this.displayDAO = displayDAO;
	}

	
}
