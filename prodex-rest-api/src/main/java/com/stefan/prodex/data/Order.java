package com.stefan.prodex.data;

import java.util.Date;

public class Order {
	
	
	private Buyer buyer; 
	
	private Item item; 
	
	private String status; 
	
	public Order() 
	{
	}
	public Order(Buyer _buyer, Item _item, String _status) {
		super();
		 
		this.buyer = _buyer;
		 
		this.item = _item;
		 
		this.status = _status;
		
	}
	
	 
	public Buyer getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(Buyer newValue) 
	{
		this.buyer = newValue;
	}
	 
	public Item getItem() 
	{
		return this.item;
	}

	public void setItem(Item newValue) 
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