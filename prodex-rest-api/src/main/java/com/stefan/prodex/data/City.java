package com.stefan.prodex.data;

public class City {
	private String name; 
	private String country;
	public City(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	public String getName() 
	{
		return name; 
	}
	public String getCountry() 
	{
		return country;
	}
}
