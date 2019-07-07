package com.stefan.prodex.data;

import java.util.Date;

public class City {
	private int id;
	
	private String name; 
	
	private String country; 
	
	public City() 
	{
	}
	public City(int id, String _name, String _country) {
		super();
		this.id = id;
		 
		this.name = _name;
		 
		this.country = _country;
		
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
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