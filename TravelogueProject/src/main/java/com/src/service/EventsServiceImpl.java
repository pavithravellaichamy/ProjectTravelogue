package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.DisplayDAO;
import com.src.dao.EventsDAO;
import com.src.model.Events;


@Service
@Transactional
public class EventsServiceImpl implements EventsService
{
	@Autowired 
	private EventsDAO eventsDAO;
	public List<Events> getAllEvents(String username, String spot, String rating)
	{
		return eventsDAO.getAllEvents(username, spot, rating);
	}
	public void setEventsDAO(EventsDAO eventsDAO) {
		this.eventsDAO = eventsDAO;
	}
 
}
