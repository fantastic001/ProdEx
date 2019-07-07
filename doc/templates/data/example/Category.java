package com.stefan.prodex.data;

import java.util.Date;

public class Category {
	private int id;
	
	private String name; 
	
	private String description; 
	
	public Category() 
	{
	}
	public Category(int id, String _name, String _description) {
		super();
		this.id = id;
		 
		this.name = _name;
		 
		this.description = _description;
		
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
	 
	public String getDescription() 
	{
		return this.description;
	}

	public void setDescription(String newValue) 
	{
		this.description = newValue;
	}
	
}