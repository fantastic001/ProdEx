package com.stefan.prodex.data;

import java.util.Date;

public class AuthInfo {
	
	
	private int buyer; 
	
	private int seller; 
	
	private int admin; 
	
	private int user; 
	
	public AuthInfo() 
	{
	}
	public AuthInfo(int _buyer, int _seller, int _admin, int _user) {
		super();
		 
		this.buyer = _buyer;
		 
		this.seller = _seller;
		 
		this.admin = _admin;
		 
		this.user = _user;
		
	}
	
	 
	public int getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(int newValue) 
	{
		this.buyer = newValue;
	}
	 
	public int getSeller() 
	{
		return this.seller;
	}

	public void setSeller(int newValue) 
	{
		this.seller = newValue;
	}
	 
	public int getAdmin() 
	{
		return this.admin;
	}

	public void setAdmin(int newValue) 
	{
		this.admin = newValue;
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