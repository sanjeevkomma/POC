package com.demo.service;

import java.util.List;

import com.demo.model.User; 

public interface UserService   {  

	public List<User> getAllUser();   

	public User getUserById(int id) ;  

	public void saveOrUpdate(User student);   

	public void delete(int id)   ;

}  