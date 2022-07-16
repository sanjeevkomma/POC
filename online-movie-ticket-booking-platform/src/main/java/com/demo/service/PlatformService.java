package com.demo.service;

import com.demo.model.Movie;

//import com.demo.model.Show;
//import com.demo.model.Theatre;

public interface PlatformService {

	Movie getMovieByName(String name);
	
	/*List<City> getCities();
	List<Theatre> getTheaters(city);
	List<Show> getShows(theater);
	List<List<Seats>> getSeats(show);
	Bill researveSeat(seats);
	Invoice makePayment(bill);*/

}
