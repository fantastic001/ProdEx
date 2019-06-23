package com.stefan.prodex.data;

import java.util.Date;

public class Conversation {
	
	
	private User user; 
	
	private Message initialMessage; 
	
	public Conversation() 
	{
	}
	public Conversation(User _user, Message _initialMessage) {
		super();
		 
		this.user = _user;
		 
		this.initialMessage = _initialMessage;
		
	}
	
	 
	public User getUser() 
	{
		return this.user;
	}

	public void setUser(User newValue) 
	{
		this.user = newValue;
	}
	 
	public Message getInitialMessage() 
	{
		return this.initialMessage;
	}

	public void setInitialMessage(Message newValue) 
	{
		this.initialMessage = newValue;
	}
	
}