package com.stefan.prodex.data;

import java.util.Date;

public class BuyerSellerLike {
	
	
	private int buyer; 
	
	private int seller; 
	
	private boolean like; 
	
	public BuyerSellerLike() 
	{
	}
	public BuyerSellerLike(int _buyer, int _seller, boolean _like) {
		super();
		 
		this.buyer = _buyer;
		 
		this.seller = _seller;
		 
		this.like = _like;
		
	}
	
	 
	public int getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(int newValue) 
	{
		this.buyer = newValue;
	}
	 
	public int getSeller() 
	{
		return this.seller;
	}

	public void setSeller(int newValue) 
	{
		this.seller = newValue;
	}
	 
	public boolean getLike() 
	{
		return this.like;
	}

	public void setLike(boolean newValue) 
	{
		this.like = newValue;
	}
	
}