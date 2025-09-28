package com.demo.service.impl;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service  
public class UserServiceImpl  implements UserService { 

	@Autowired  
	UserRepository userRepository;  

	@Override
	public List<User> getAllUser()   { 

		List<User> users = new ArrayList<User>();  

		userRepository.findAll().forEach(user -> users.add(user));  

		return users;  
	}  

	@Override
	public User getUserById(int id)   {  

		return userRepository.findById(id).get();  
	} 

	@Override
	public void saveOrUpdate(User user)   { 

		userRepository.save(user);  
	}  

	@Override
	public void delete(int id)   { 

		userRepository.deleteById(id);  
	}  
}  