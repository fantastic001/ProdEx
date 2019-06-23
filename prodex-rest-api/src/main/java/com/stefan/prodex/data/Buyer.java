package com.stefan.prodex.data;

import java.util.Date;

public class Buyer {
	
	
	private User user; 
	
	public Buyer() 
	{
	}
	public Buyer(User _user) {
		super();
		 
		this.user = _user;
		
	}
	
	 
	public User getUser() 
	{
		return this.user;
	}

	public void setUser(User newValue) 
	{
		this.user = newValue;
	}
	
}