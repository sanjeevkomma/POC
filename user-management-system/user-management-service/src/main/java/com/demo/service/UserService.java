package com.demo.service;

import com.demo.model.User;

import java.util.List;

public interface UserService   {  

	public List<User> getAllUser();   

	public User getUserById(int id) ;  

	public void saveOrUpdate(User student);   

	public void delete(int id)   ;

}  