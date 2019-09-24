package com.stefan.prodex.data;

import java.util.Date;

public class Conversation {
	private int id;
	
	private int user; 
	
	private int initialMessage; 

	private String body;
	
	public Conversation() 
	{
	}
	public Conversation(int id, int _user, int _initialMessage) {
		super();
		this.id = id;
		 
		this.user = _user;
		 
		this.initialMessage = _initialMessage;
		
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
	}
	 
	public int getUser() 
	{
		return this.user;
	}

	public void setUser(int newValue) 
	{
		this.user = newValue;
	}
	 
	public int getInitialMessage() 
	{
		return this.initialMessage;
	}

	public void setInitialMessage(int newValue) 
	{
		this.initialMessage = newValue;
	}
	
}
