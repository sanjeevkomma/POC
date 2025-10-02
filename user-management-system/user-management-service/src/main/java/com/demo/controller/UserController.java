package com.demo.controller;

import com.demo.model.User;
import com.demo.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/user")
@Tag(name = "User Management", description = "Operations for managing users")
public class UserController   { 

	@Autowired  
	UserService userService;  

	@GetMapping("/all")
	private List<User> getAllUser()   {  

		return userService.getAllUser();  
	}  

	@GetMapping("/{id}")
	private User getUser(@PathVariable("id") int id)   {

		return userService.getUserById(id);  
	}  

	@DeleteMapping("/{id}")
	private void deleteUser(@PathVariable("id") int id)   {  

		userService.delete(id);  
	}  

	@PostMapping("/create")
	private int saveUser(@RequestBody User user) {     

		userService.saveOrUpdate(user);  

		return user.getId();  
	}  
}  