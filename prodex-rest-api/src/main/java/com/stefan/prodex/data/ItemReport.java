package com.stefan.prodex.data;

import java.util.Date;

public class ItemReport {
	
	
	private Item item; 
	
	private String title; 
	
	private String body; 
	
	private Buyer buyer; 
	
	public ItemReport() 
	{
	}
	public ItemReport(Item _item, String _title, String _body, Buyer _buyer) {
		super();
		 
		this.item = _item;
		 
		this.title = _title;
		 
		this.body = _body;
		 
		this.buyer = _buyer;
		
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
	
}