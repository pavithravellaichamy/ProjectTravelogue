package com.src.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.AdminLogin;
import com.src.model.Suggestion;
import com.src.model.UserRegistration;
import com.src.service.AdminService;
import com.src.service.DisplayService;
import com.src.service.RegistrationService;
import com.src.service.ReviewService;
import com.src.service.UserService;

@Controller
public class ProjectController 
{
	//private static final Logger logger = Logger
	//		.getLogger(ProjectController.class);
	
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
	
	@RequestMapping(value= "/")
	public String mainUsers()
	{
		return "index";
	}
	
	@RequestMapping(value = "/admin")
	public ModelAndView adminLogin(ModelAndView model) throws IOException {
		AdminLogin login=new AdminLogin();		
		model.addObject("login",login);		
		model.setViewName("adminlogin");
		return model;
	}
	
	@RequestMapping(value = "/adminLogin")
	public ModelAndView adminLogin(@ModelAttribute("login")AdminLogin ad,ModelAndView model)  {
		
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
	
	@RequestMapping(value = "/userlogin")
	public ModelAndView loginUser(ModelAndView model) {
		
		model.setViewName("userlogin");
		return model;
	}
	
	@RequestMapping(value = "/userpage")
	public ModelAndView userLogin(@RequestParam("username")String username, @RequestParam("password")String password,ModelAndView model) throws IOException {
		
		boolean b= userService.validate(username, password);
		System.out.println(username);
		System.out.println(password);
		System.out.println(b);
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
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		UserRegistration user = new UserRegistration();
		model.addObject("user", user);
		model.setViewName("register");
		return model;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute UserRegistration user,ModelAndView model) {
		if (user.getUsername()!=" ") 
			{
				registers.registerUsers(user);
			}
		model.setViewName("userlogin");
		return model;
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.PUT)
	public ModelAndView review(ModelAndView model) {
		Suggestion suggest = new Suggestion();
		model.addObject("suggest", suggest);
		model.setViewName("review");
		return model;
	}

	@RequestMapping(value = "/saveReview", method = RequestMethod.PUT)
	public ModelAndView saveReview(@ModelAttribute Suggestion suggest, ModelAndView model) throws Exception {
		if(suggest.getName()!=null) 
			{
				suggests.reviewUpdate(suggest);
			}
		return new ModelAndView("redirect:saveReview");
	}
	
	@RequestMapping(value = "/suggestions", method = RequestMethod.GET)
	public ModelAndView displayReview(@ModelAttribute Suggestion suggest, ModelAndView model) throws IOException
	{
		List<Suggestion> listSuggestion = displayServices.getAllSuggestion();
		
		Iterator<Suggestion> itr=listSuggestion.iterator();
	       
        while(itr.hasNext())
        {
            Suggestion im=itr.next();
            byte by[]=im.getImage();
           
            
            ByteArrayInputStream input=new ByteArrayInputStream(by);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
           
           while ((bytesRead = input.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);                 
            }
            
            byte[] imageBytes = outputStream.toByteArray();
           String base64Image = Base64.getEncoder().encodeToString(imageBytes);
           
           im.setBase64Image(base64Image);
        }
        model.addObject("listSuggestion", listSuggestion);
        model.setViewName("suggest");
        return model;
	}
}

