package com.src.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.AdminLogin;
import com.src.model.Events;
import com.src.model.Suggestion;
import com.src.model.UserRegistration;
import com.src.service.AdminService;
import com.src.service.DisplayService;
import com.src.service.EventsService;
import com.src.service.RegistrationService;
import com.src.service.ReviewService;
import com.src.service.UserService;

@Controller
public class ProjectController 
{
	//private static final Logger logger = Logger.getLogger(ProjectController.class);
	
	public ProjectController() {
		System.out.println("ProjectController()");
	}
	
	@Autowired
	private RegistrationService registers;
	
	@Autowired
	private ReviewService suggests;
	
	@Autowired
	private DisplayService displayServices;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private EventsService eventsService;
	
	@RequestMapping(value= "/")
	public String mainUsers()
	{
		return "index";
	}
	//admin login validation 
	@RequestMapping(value = "/admin")
	public ModelAndView adminLogin(ModelAndView model) throws IOException {
		AdminLogin login=new AdminLogin();		
		model.addObject("login",login);		
		model.setViewName("adminlogin");
		return model;
	}
	
	@RequestMapping(value = "/adminLogin")
	public ModelAndView adminLogin(@ModelAttribute("login")AdminLogin ad, ModelAndView model)  {
		
		boolean b=adminService.validate(ad);
		
		if(b)
		{
			
			model.setViewName("mainpage1");
		}
		else
		{
			model.setViewName("adminlogin");
		}
		return model;
	}
	//user login validation
	@RequestMapping(value = "/userlogin")
	public ModelAndView loginUser(ModelAndView model) {
		
		model.setViewName("userlogin");
		return model;
	}
	
	@RequestMapping(value = "/userpage")
	public ModelAndView userLogin(@RequestParam("username")String username, @RequestParam("password")String password,ModelAndView model) throws IOException {
		
		boolean b= userService.validate(username, password);
		if(b)
		{
			model.setViewName("mainpage");
		}
		else
		{
			model.setViewName("userlogin");
		}
		return model;
	}
	
	//new user registration
	@RequestMapping(value = "/new")
	public ModelAndView newContact(ModelAndView model) {
		UserRegistration users = new UserRegistration();
		model.addObject("users", users);
		model.setViewName("register");
		return model;
	}

	@RequestMapping(value = "/saveUser")
	public ModelAndView saveUser(@ModelAttribute UserRegistration users,ModelAndView model) {
		if (users.getPassword()==users.getReenter_password()) 
			{
				registers.registerUsers(users);
				model.setViewName("userlogin");
				return model;
			}
		else
			{
				model.setViewName("register");
				return model;
			}
	}
	//uploading suggestions
	@RequestMapping(value = "/upload")
	public ModelAndView review(ModelAndView model) {
		Suggestion suggestion = new Suggestion();
		model.addObject("suggestion", suggestion);
		model.setViewName("review");
		return model;
	}

	@RequestMapping(value= "/saveReview")
	public ModelAndView saveReview(@Valid @ModelAttribute("suggestion") Suggestion suggestion, ModelAndView model,BindingResult bindingResult) throws Exception {
		if(suggestion.getUsername()==null || bindingResult.hasErrors()) 
			{
				model.setViewName("review");
				return model;
			}
		else {
			suggests.reviewUpdate(suggestion);
			model.setViewName("mainpage");
			return model;
			}
	}
	
	//suggestions
	@RequestMapping(value = "/suggestions")
	public ModelAndView displayReview(@ModelAttribute Suggestion suggestion, ModelAndView model) throws IOException
	{
		List<Suggestion> listSuggestion = displayServices.getAllSuggestion();
        model.addObject("listSuggestion", listSuggestion);
        model.setViewName("suggest");
        return model;
	}
	
	@RequestMapping(value = "/suggested")
	public ModelAndView displayAdminReview(@ModelAttribute Suggestion suggestion, ModelAndView model) throws IOException
	{
		List<Suggestion> listSuggestion = displayServices.getAllSuggestion();
        model.addObject("listSuggestion", listSuggestion);
        model.setViewName("suggested");
        return model;
	} 
	
	//events
	@RequestMapping(value = "/events")
	public ModelAndView listEvents(ModelAndView model) {
		Events event = new Events();
		model.addObject("event", event);
		model.setViewName("events");
		return model;
	}
	
	@RequestMapping(value = "/saveEvents")
	public ModelAndView displayEvents(@RequestParam("username")String username, @RequestParam("spot")String spot,@RequestParam("rating")String rating,@ModelAttribute Suggestion suggestion, ModelAndView model) throws IOException
	{
		List<Events> listSuggestion = eventsService.getAllEvents(username,spot,rating);
        model.addObject("listSuggestion", listSuggestion);
        model.setViewName("mainpage1");
        return model;
		
	}
	
	@RequestMapping(value= "/logout")
	public String logout()
	{
		return "index";
	}
}

