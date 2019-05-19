package com.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Model.User;
import com.example.Services.UserService;;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userService;
	 @GetMapping("/")
	public String hello() {
		return "This is homepage";
	}

	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age,@RequestParam String password) {
		 
		User user= new User(username, firstname,lastname,age,password);
		userService.saveMyUser(user);
		return "user saved";
	}
}
