package com.app.services;

import com.app.entities.User;

//import com.app.dto.UserDTO;

public interface UserService {
	User getUser(String email);
	User getUser(String email, String password);
}
