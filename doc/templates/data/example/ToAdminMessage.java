package com.stefan.prodex.data;

import java.util.Date;

public class ToAdminMessage {
	
	
	private Seller seller; 
	
	private Admin admin; 
	
	private String title; 
	
	private String body; 
	
	public ToAdminMessage() 
	{
	}
	public ToAdminMessage(Seller _seller, Admin _admin, String _title, String _body) {
		super();
		 
		this.seller = _seller;
		 
		this.admin = _admin;
		 
		this.title = _title;
		 
		this.body = _body;
		
	}
	
	 
	public Seller getSeller() 
	{
		return this.seller;
	}

	public void setSeller(Seller newValue) 
	{
		this.seller = newValue;
	}
	 
	public Admin getAdmin() 
	{
		return this.admin;
	}

	public void setAdmin(Admin newValue) 
	{
		this.admin = newValue;
	}
	 
	public String getTitle() 
	{
		return this.title;
	}

	public void setTitle(String newValue) 
	{
		this.title = newValue;
	}
	 
	public String getBody() 
	{
		return this.body;
	}

	public void setBody(String newValue) 
	{
		this.body = newValue;
	}
	
}