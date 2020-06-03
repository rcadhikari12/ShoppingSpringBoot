package com.shopping.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.webapp.dao.UserRepository;
import com.shopping.webapp.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User getUser(long id)
	{
		return userRepository.getOne(id);
		
	}
	
	public User registerUser(User user)
	{
		return userRepository.save(user);
	}
	
	

}
