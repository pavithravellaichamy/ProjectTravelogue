package com.src.service;

import java.util.List;

import com.src.model.Events;

public interface EventsService 
{
	public List<Events> getAllEvents(String username, String spot, String rating);

}
