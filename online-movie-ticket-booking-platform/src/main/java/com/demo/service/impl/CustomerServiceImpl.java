package com.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Genre;
import com.demo.model.Language;
import com.demo.model.Movie;
import com.demo.model.Theatre;
import com.demo.model.Ticket;
import com.demo.service.CustomerService;


@Service  
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Movie getMovieByName(String name) {
		
		Movie m = new Movie(name, Language.ENGLISH , Genre.COMEDY);
		
		return m;
	}

	@Override
	public List<Theatre> getTheatres(String movieName, String cityName, String date) {
		
		return null;
	}

	@Override
	public Ticket bookTicket(Ticket ticket) {
		
		// Booking platform offers in selected cities and theatres
		// 50% discount on the third ticket
		// Tickets booked for the afternoon show get a 20% discount

		
		// String theatreName, String timing, List<String> seats, String date
		// ticket.getBookedShow().getTheater().getName(),ticket.getBookingTime(), ticket.getNumberOfSeats() , ticket.getBookedShow().g
		
		return ticket;
		
	}

	@Override
	public void cancelTicket() {
		
		
	}

	@Override
	public List<Movie> browseMovies(String cityName, String langName, String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> bulkBookingTickets(List<Ticket> tickets) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelTicket(Integer bookingId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelingTickets(List<Integer> bookingIds) {
		// TODO Auto-generated method stub
		
	}

}
