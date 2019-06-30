package com.stefan.prodex.data;

import java.util.Date;

public class Buyer {
	
	
	private int user; 
	
	public Buyer() 
	{
	}
	public Buyer(int _user) {
		super();
		 
		this.user = _user;
		
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