package com.app.services;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.app.dto.UserDTO;
import com.app.entities.User;
import com.app.repos.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private ModelMapper mapper;
	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		User user = userRepo.findByEmail(email);
		//UserDTO userDTO = mapper.map(user, UserDTO.class);
		return user;
	}

	@Override
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub 
		User user = userRepo.findByEmailAndPassword(email, password);
		//UserDTO userDTO = mapper.map(user, UserDTO.class);
		return user;
	}

}
