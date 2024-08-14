package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service   
public class UserService {

	private List<User> store=new ArrayList<>();
	
	public UserService( )
	{
		store.add(  new User( UUID.randomUUID().toString( ), 
				"SHIVENDRA GUPTA","abcd@gmail.com" ) );
		store.add(  new User( UUID.randomUUID().toString( ), 
				"SHIV","abcd123@gmail.com" ) );
		store.add(  new User( UUID.randomUUID().toString( ), 
				"Abcd","xcvz12@gmail.com" ) );
	}
	public List<User> getUsers( )
	{
		return this.store;
	}
}
