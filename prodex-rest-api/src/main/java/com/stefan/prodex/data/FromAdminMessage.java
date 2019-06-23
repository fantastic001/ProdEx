package com.stefan.prodex.data;

import java.util.Date;

public class FromAdminMessage {
	
	
	private Admin admin; 
	
	private String title; 
	
	private String body; 
	
	private User user; 
	
	public FromAdminMessage() 
	{
	}
	public FromAdminMessage(Admin _admin, String _title, String _body, User _user) {
		super();
		 
		this.admin = _admin;
		 
		this.title = _title;
		 
		this.body = _body;
		 
		this.user = _user;
		
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
	 
	public User getUser() 
	{
		return this.user;
	}

	public void setUser(User newValue) 
	{
		this.user = newValue;
	}
	
}