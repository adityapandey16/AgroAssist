package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService user;
	
	@GetMapping("/users")
	public User getUser(String email)
	{
		return user.getUser(email);
	}
	
	@GetMapping("/login")
	public User getUser(String email, String password)
	{
		return user.getUser(email, password);
	}
}
