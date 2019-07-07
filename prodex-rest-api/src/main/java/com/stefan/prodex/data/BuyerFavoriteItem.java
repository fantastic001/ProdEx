package com.stefan.prodex.data;

import java.util.Date;

public class BuyerFavoriteItem {
	private int id;
	
	private int buyer; 
	
	private int item; 
	
	public BuyerFavoriteItem() 
	{
	}
	public BuyerFavoriteItem(int id, int _buyer, int _item) {
		super();
		this.id = id;
		 
		this.buyer = _buyer;
		 
		this.item = _item;
		
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
	
}