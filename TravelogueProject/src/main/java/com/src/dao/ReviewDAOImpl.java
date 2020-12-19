package com.src.dao;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

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
	public void reviewUpdate(Suggestion suggest) throws Exception
	{
		sessionFactory.getCurrentSession().saveOrUpdate(suggest);		
	}	
	}

