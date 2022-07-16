package com.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Genre;
import com.demo.model.Language;
import com.demo.model.Movie;
import com.demo.model.Theatre;
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
	public void bookTicket(String theatreName, String timing, List<String> seats, String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTicket() {
		// TODO Auto-generated method stub
		
	}

}
