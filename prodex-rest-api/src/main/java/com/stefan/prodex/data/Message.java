package com.stefan.prodex.data;

import java.util.Date;

public class Message {
	
	
	private Item item; 
	
	private String title; 
	
	private String body; 
	
	private Buyer buyer; 
	
	private boolean unread; 
	
	public Message() 
	{
	}
	public Message(Item _item, String _title, String _body, Buyer _buyer, boolean _unread) {
		super();
		 
		this.item = _item;
		 
		this.title = _title;
		 
		this.body = _body;
		 
		this.buyer = _buyer;
		 
		this.unread = _unread;
		
	}
	
	 
	public Item getItem() 
	{
		return this.item;
	}

	public void setItem(Item newValue) 
	{
		this.item = newValue;
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
	 
	public Buyer getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(Buyer newValue) 
	{
		this.buyer = newValue;
	}
	 
	public boolean getUnread() 
	{
		return this.unread;
	}

	public void setUnread(boolean newValue) 
	{
		this.unread = newValue;
	}
	
}