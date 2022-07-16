package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Movie;
import com.demo.service.PlatformService;  

@RestController  
public class PlatformController {
	
	@Autowired  
	PlatformService platformService;  

	/*@GetMapping("/user")  
	private List<User> getAllMovies()   {  

		return platformService.getAllMovies();  
	}  */

	@GetMapping("/movie/{name}")  
	private Movie getMovie(@PathVariable("name") String name)   {

		return platformService.getMovieByName(name);  
	} 

}
