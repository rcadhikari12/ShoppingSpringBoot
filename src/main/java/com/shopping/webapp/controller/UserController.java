package com.shopping.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.webapp.model.User;
import com.shopping.webapp.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userService;
	
	
	@GetMapping("getUser/{id}")
	public User getUserById(@PathVariable("id") long id) 
	{
		return userService.getUser(id);
	}
	
	
	
	@PostMapping("/user")
	public String user() 
	{
		return ("welcome user");
		
	}
	
	@GetMapping("/")
	public String welcome() 
	{
		return "Welcome page";
	}
	
	
	

}
