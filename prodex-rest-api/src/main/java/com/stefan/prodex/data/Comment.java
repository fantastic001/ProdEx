package com.stefan.prodex.data;

import java.util.Date;

public class Comment {
	
	
	private Item item; 
	
	private String body; 
	
	private User user; 
	
	public Comment() 
	{
	}
	public Comment(Item _item, String _body, User _user) {
		super();
		 
		this.item = _item;
		 
		this.body = _body;
		 
		this.user = _user;
		
	}
	
	 
	public Item getItem() 
	{
		return this.item;
	}

	public void setItem(Item newValue) 
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
	 
	public User getUser() 
	{
		return this.user;
	}

	public void setUser(User newValue) 
	{
		this.user = newValue;
	}
	
}