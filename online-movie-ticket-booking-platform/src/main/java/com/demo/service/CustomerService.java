package com.demo.service;

import java.util.List;

import com.demo.model.Movie;
import com.demo.model.Theatre;
import com.demo.model.Ticket;

//import com.demo.model.Show;
//import com.demo.model.Theatre;

public interface CustomerService {

	Movie getMovieByName(String name);
	
	List<Theatre> getTheatres(String movieName, String cityName, String date);
	
	Ticket bookTicket(Ticket ticket);
	
	void cancelTicket();

	List<Movie> browseMovies(String cityName, String langName, String genre);

	List<Ticket> bulkBookingTickets(List<Ticket> tickets);

	void cancelTicket(Integer bookingId);

	void cancelingTickets(List<Integer> bookingIds);
	
	/*List<City> getCities();
	List<Theatre> getTheaters(city);
	List<Show> getShows(theater);
	List<List<Seats>> getSeats(show);
	Bill researveSeat(seats);
	Invoice makePayment(bill);*/

}
