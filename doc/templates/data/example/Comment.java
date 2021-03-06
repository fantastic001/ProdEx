package com.stefan.prodex.data;

import java.util.Date;

public class Comment {
	private int id;
	
	private int item; 
	
	private String body; 
	
	private int user; 
	
	public Comment() 
	{
	}
	public Comment(int id, int _item, String _body, int _user) {
		super();
		this.id = id;
		 
		this.item = _item;
		 
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
	 
	public int getItem() 
	{
		return this.item;
	}

	public void setItem(int newValue) 
	{
		this.item = newValue;
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