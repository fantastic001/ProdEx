package com.stefan.prodex.data;

import java.util.Date;

public class ItemReport {
	private int id;
	
	private int item; 
	
	private String title; 
	
	private String body; 
	
	private int buyer; 
	
	public ItemReport() 
	{
	}
	public ItemReport(int id, int _item, String _title, String _body, int _buyer) {
		super();
		this.id = id;
		 
		this.item = _item;
		 
		this.title = _title;
		 
		this.body = _body;
		 
		this.buyer = _buyer;
		
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
	 
	public int getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(int newValue) 
	{
		this.buyer = newValue;
	}
	
}