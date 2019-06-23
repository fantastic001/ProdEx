package com.stefan.prodex.data;

import java.util.Date;

public class SellerReport {
	
	
	private Seller seller; 
	
	private Buyer buyer; 
	
	private String title; 
	
	private String body; 
	
	public SellerReport() 
	{
	}
	public SellerReport(Seller _seller, Buyer _buyer, String _title, String _body) {
		super();
		 
		this.seller = _seller;
		 
		this.buyer = _buyer;
		 
		this.title = _title;
		 
		this.body = _body;
		
	}
	
	 
	public Seller getSeller() 
	{
		return this.seller;
	}

	public void setSeller(Seller newValue) 
	{
		this.seller = newValue;
	}
	 
	public Buyer getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(Buyer newValue) 
	{
		this.buyer = newValue;
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
	
}