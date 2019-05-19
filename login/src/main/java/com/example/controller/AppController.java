package com.example.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Model.User;
import com.example.Services.UserService;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;

@Controller
public class AppController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/welcome")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode","MODE_HOME");
		
		return "Welcome Page";
	}
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode","MODE_REGISTER");
		
		return "Welcome Page";
	}
	
	@RequestMapping("/save-user")
	public String registerUser(@ModelAttribute User user,BindingResult bindingResult, HttpServletRequest request ) {
		userService.saveMyUser(user);
		request.setAttribute("mode","MODE_HOME");
		
		return "Welcome Page";
	}
	
	
	
	
}
