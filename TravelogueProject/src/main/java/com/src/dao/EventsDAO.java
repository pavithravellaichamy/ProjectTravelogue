package com.src.dao;

import java.util.List;

import com.src.model.Events;
import com.src.model.UserRegistration;

public interface EventsDAO
{
	public List<Events> getAllEvents(String username, String spot, String rating);
}
