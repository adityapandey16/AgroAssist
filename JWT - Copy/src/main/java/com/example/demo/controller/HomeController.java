package com.example.demo.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.services.UserService;

@RestController  
@RequestMapping("/home")         
public class HomeController {

	@Autowired  
	private UserService userService;
	
	
	@GetMapping("/users")     // http://localhost:8081/home/users
	public List<User> getUser() {
		System.out.println("getting users");
		return this.userService.getUsers( );
	}
	
	@GetMapping("/current-user")
	public String getCurrentLoggedInUser( Principal principal)
	{
		return principal.getName();     // Principal interface meh method hai getName( ) -->
													//--> hum ess method ko directly use kr leh rhe hai jbh ke yeh I/F ka method hai
	}
}
