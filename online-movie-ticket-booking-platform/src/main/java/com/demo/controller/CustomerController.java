package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Movie;
import com.demo.model.Theatre;
import com.demo.service.CustomerService;  

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired  
	CustomerService customerService;  

	/*@GetMapping("/user")  
	private List<User> getAllMovies()   {  

		return platformService.getAllMovies();  
	}  */

	@GetMapping("/movie/{name}")  
	private Movie getMovie(@PathVariable("name") String name)   {

		return customerService.getMovieByName(name);  
	} 

	@GetMapping("/theatre/{movieName}/{cityName}/{date}") 
	public List<Theatre> getTheatres(String movieName, String cityName, String date) {
		
		return customerService.getTheatres(movieName,cityName, date  );

	}

}