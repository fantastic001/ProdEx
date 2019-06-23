package com.stefan.prodex.data;

import java.util.Date;

public class BuyerFavoriteItem {
	
	
	private Buyer buyer; 
	
	private Item item; 
	
	public BuyerFavoriteItem() 
	{
	}
	public BuyerFavoriteItem(Buyer _buyer, Item _item) {
		super();
		 
		this.buyer = _buyer;
		 
		this.item = _item;
		
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
	
}