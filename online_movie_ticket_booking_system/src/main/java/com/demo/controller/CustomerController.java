package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Movie;
import com.demo.model.Theatre;
import com.demo.model.Ticket;
import com.demo.service.CustomerService;  

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired  
	CustomerService customerService;  

	@GetMapping("/movie/{name}")  
	private Movie getMovie(@PathVariable("name") String name)   {

		return customerService.getMovieByName(name);  
	} 
	
	@GetMapping("/movies/{cityName}/{langName}/{genre}") 
	public List<Movie> browseMovies(@PathVariable("cityName") String cityName, @PathVariable("langName")String langName,@PathVariable("genre")String genre) {
		
		return customerService.browseMovies(cityName,langName, genre  );

	}
	
	@PostMapping("/book") 
	public Ticket bookTicket(@RequestBody Ticket ticket) {
		
		return customerService.bookTicket(ticket);
		
	}
	
	@PostMapping("/bulk/book") 
	public List<Ticket> bulkBookingTickets(@RequestBody List<Ticket> tickets) {
		
		return customerService.bulkBookingTickets(tickets);
		
	}

	@DeleteMapping("/cancel/{bookingId}")
	public void cancelTicket(@PathVariable("bookingId") Integer bookingId) {
		
		 customerService.cancelTicket(bookingId);
		
	}
	
	@DeleteMapping("/bulk/cancel")
	public void bulkCancelingTickets(@RequestBody List<Integer> bookingIds) {
		
		customerService.cancelingTickets(bookingIds);
		
	}

	@GetMapping("/theatre/{movieName}/{cityName}/{date}") 
	public List<Theatre> browseTheatres(@PathVariable("movieName") String movieName, @PathVariable("cityName") String cityName, @PathVariable("date") String date) {
		
		return customerService.getTheatres(movieName,cityName, date  );

	}

}