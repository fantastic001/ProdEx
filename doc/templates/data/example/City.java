package com.stefan.prodex.data;

import java.util.Date;

public class City {
	
	
	private String name; 
	
	private String country; 
	
	public City() 
	{
	}
	public City(String _name, String _country) {
		super();
		 
		this.name = _name;
		 
		this.country = _country;
		
	}
	
	 
	public String getName() 
	{
		return this.name;
	}

	public void setName(String newValue) 
	{
		this.name = newValue;
	}
	 
	public String getCountry() 
	{
		return this.country;
	}

	public void setCountry(String newValue) 
	{
		this.country = newValue;
	}
	
}