package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.demo.model.Genre;
import com.demo.model.Language; 

@Entity  
@Table  
public class Movie {

	@Id  
	@Column  
	private int id;  

	@Column  
	private String name;

	@Column  	
	private float ratings;

	/*@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)  
	@Column  
	private Language language;*/

	@Column  
	private Genre genre;

	public Movie() {

	}

}
