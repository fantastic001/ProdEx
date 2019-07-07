package com.stefan.prodex.data;

import java.util.Date;

public class Order {
	private int id;
	
	private int buyer; 
	
	private int item; 
	
	private String status; 
	
	public Order() 
	{
	}
	public Order(int id, int _buyer, int _item, String _status) {
		super();
		this.id = id;
		 
		this.buyer = _buyer;
		 
		this.item = _item;
		 
		this.status = _status;
		
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
	}
	 
	public int getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(int newValue) 
	{
		this.buyer = newValue;
	}
	 
	public int getItem() 
	{
		return this.item;
	}

	public void setItem(int newValue) 
	{
		this.item = newValue;
	}
	 
	public String getStatus() 
	{
		return this.status;
	}

	public void setStatus(String newValue) 
	{
		this.status = newValue;
	}
	
}