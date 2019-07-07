package com.stefan.prodex.data;

import java.util.Date;

public class OrderReview {
	private int id;
	
	private String title; 
	
	private String body; 
	
	private String image; 
	
	private int type; 
	
	private int buyer; 
	
	private int order; 
	
	public OrderReview() 
	{
	}
	public OrderReview(int id, String _title, String _body, String _image, int _type, int _buyer, int _order) {
		super();
		this.id = id;
		 
		this.title = _title;
		 
		this.body = _body;
		 
		this.image = _image;
		 
		this.type = _type;
		 
		this.buyer = _buyer;
		 
		this.order = _order;
		
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
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
	 
	public String getImage() 
	{
		return this.image;
	}

	public void setImage(String newValue) 
	{
		this.image = newValue;
	}
	 
	public int getType() 
	{
		return this.type;
	}

	public void setType(int newValue) 
	{
		this.type = newValue;
	}
	 
	public int getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(int newValue) 
	{
		this.buyer = newValue;
	}
	 
	public int getOrder() 
	{
		return this.order;
	}

	public void setOrder(int newValue) 
	{
		this.order = newValue;
	}
	
}