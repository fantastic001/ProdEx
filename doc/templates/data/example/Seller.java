package com.stefan.prodex.data;

import java.util.Date;

public class Seller {
	
	
	private User user; 
	
	public Seller() 
	{
	}
	public Seller(User _user) {
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