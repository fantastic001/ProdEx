package com.stefan.prodex.data;

import java.util.Date;

public class BuyerSellerLike {
	
	
	private Buyer buyer; 
	
	private Seller seller; 
	
	private boolean like; 
	
	public BuyerSellerLike() 
	{
	}
	public BuyerSellerLike(Buyer _buyer, Seller _seller, boolean _like) {
		super();
		 
		this.buyer = _buyer;
		 
		this.seller = _seller;
		 
		this.like = _like;
		
	}
	
	 
	public Buyer getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(Buyer newValue) 
	{
		this.buyer = newValue;
	}
	 
	public Seller getSeller() 
	{
		return this.seller;
	}

	public void setSeller(Seller newValue) 
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