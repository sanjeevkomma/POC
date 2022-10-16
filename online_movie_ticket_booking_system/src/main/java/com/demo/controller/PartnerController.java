package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Show;
import com.demo.model.Theatre;
import com.demo.service.PartnerService;

@RestController
@RequestMapping("/partner")
public class PartnerController {

	@Autowired  
	PartnerService partnerService;  

	@PostMapping("/theatre")  
	public Theatre onboardTheatre(@RequestBody Theatre theatre)   {

		return partnerService.onboardTheatre(theatre);  
	} 
	
	// create show for the day
	
	@PostMapping("/show")  
	public Show createShow(@RequestBody Show show)   {

		return partnerService.createShow(show);  
	}
	
	@GetMapping("/show/{showId}") 
	public Show getShow(@PathVariable("showId") Integer showId)   {

		return partnerService.getShow(showId);  
	}
	
	@PutMapping("/show/{showId}")  
	public Show updateShow(@PathVariable("showId") Integer showId)   {

		return partnerService.updateShow(showId);  
	}
	
	@DeleteMapping("/show/{showId}")  
	public void deleteShow(@PathVariable("showId") Integer showId)   {

		partnerService.deleteShow(showId);  
	}
	
	
	@PutMapping("/allocate/seat/{showId}")  
	public void allocateSeatForShow(@PathVariable("showId") Integer showId)   {

		partnerService.allocateSeatForShow(showId);  
	}
	
	@PutMapping("/update/seat/{showId}")  
	public void updateSeatForShow(@PathVariable("showId") Integer showId)   {

		partnerService.updateSeatForShow(showId);  
	}
	
}
