package com.stefan.prodex.data;

import java.util.Date;

public class SellerReport {
	
	
	private int seller; 
	
	private int buyer; 
	
	private String title; 
	
	private String body; 
	
	public SellerReport() 
	{
	}
	public SellerReport(int _seller, int _buyer, String _title, String _body) {
		super();
		 
		this.seller = _seller;
		 
		this.buyer = _buyer;
		 
		this.title = _title;
		 
		this.body = _body;
		
	}
	
	 
	public int getSeller() 
	{
		return this.seller;
	}

	public void setSeller(int newValue) 
	{
		this.seller = newValue;
	}
	 
	public int getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(int newValue) 
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