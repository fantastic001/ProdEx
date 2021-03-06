package com.stefan.prodex.data;

import java.util.Date;

public class FromAdminMessage {
	private int id;
	
	private int admin; 
	
	private String title; 
	
	private String body; 
	
	private int user; 
	
	public FromAdminMessage() 
	{
	}
	public FromAdminMessage(int id, int _admin, String _title, String _body, int _user) {
		super();
		this.id = id;
		 
		this.admin = _admin;
		 
		this.title = _title;
		 
		this.body = _body;
		 
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
	 
	public int getAdmin() 
	{
		return this.admin;
	}

	public void setAdmin(int newValue) 
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
	 
	public int getUser() 
	{
		return this.user;
	}

	public void setUser(int newValue) 
	{
		this.user = newValue;
	}
	
}