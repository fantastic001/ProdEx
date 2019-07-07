package com.stefan.prodex.data;

import java.util.Date;

public class ToAdminMessage {
	private int id;
	
	private int seller; 
	
	private int admin; 
	
	private String title; 
	
	private String body; 
	
	public ToAdminMessage() 
	{
	}
	public ToAdminMessage(int id, int _seller, int _admin, String _title, String _body) {
		super();
		this.id = id;
		 
		this.seller = _seller;
		 
		this.admin = _admin;
		 
		this.title = _title;
		 
		this.body = _body;
		
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
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