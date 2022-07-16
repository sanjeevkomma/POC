package com.demo.service.impl;

import org.springframework.stereotype.Service;

import com.demo.model.Genre;
import com.demo.model.Language;
import com.demo.model.Movie;
import com.demo.service.PlatformService;

@Service  
public class PlatformServiceImpl implements PlatformService {

	@Override
	public Movie getMovieByName(String name) {
		
		Movie m = new Movie(name, Language.ENGLISH , Genre.COMEDY);
		
		return m;
	}

}
