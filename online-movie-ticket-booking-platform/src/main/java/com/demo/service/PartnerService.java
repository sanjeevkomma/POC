package com.demo.service;

import com.demo.model.Show;
import com.demo.model.Theatre;

public interface PartnerService {

	Theatre onboardTheatre(Theatre theatre);

	Show createShow(Show show);

	Show getShow(Integer showId);

	Show updateShow(Integer showId);

	Object deleteShow(Integer showId);

	void allocateSeatForShow(Integer showId);

	void updateSeatForShow(Integer showId);
	
}
