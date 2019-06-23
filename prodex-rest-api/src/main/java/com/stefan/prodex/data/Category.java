package com.stefan.prodex.data;

import java.util.Date;

public class Category {
	
	
	private String name; 
	
	private String description; 
	
	public Category() 
	{
	}
	public Category(String _name, String _description) {
		super();
		 
		this.name = _name;
		 
		this.description = _description;
		
	}
	
	 
	public String getName() 
	{
		return this.name;
	}

	public void setName(String newValue) 
	{
		this.name = newValue;
	}
	 
	public String getDescription() 
	{
		return this.description;
	}

	public void setDescription(String newValue) 
	{
		this.description = newValue;
	}
	
}