package com.stefan.prodex.data;

import java.util.Date;

public class Admin {
	private int id;
	
	private int user; 
	
	public Admin() 
	{
	}
	public Admin(int id, int _user) {
		super();
		this.id = id;
		 
		this.user = _user;
		
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
	}
	 
	public int getUser() 
	{
		return this.user;
	}

	public void setUser(int newValue) 
	{
		this.user = newValue;
	}
	
}