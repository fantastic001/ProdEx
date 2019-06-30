package com.stefan.prodex.data;

import java.util.Date;

public class Conversation {
	
	
	private int user; 
	
	private int initialMessage; 
	
	public Conversation() 
	{
	}
	public Conversation(int _user, int _initialMessage) {
		super();
		 
		this.user = _user;
		 
		this.initialMessage = _initialMessage;
		
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