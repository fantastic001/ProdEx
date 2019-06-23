package com.stefan.prodex.data;

import java.util.Date;

public class OrderReview {
	
	
	private String title; 
	
	private String body; 
	
	private String image; 
	
	private OrderReviewType type; 
	
	private Buyer buyer; 
	
	private Order order; 
	
	public OrderReview() 
	{
	}
	public OrderReview(String _title, String _body, String _image, OrderReviewType _type, Buyer _buyer, Order _order) {
		super();
		 
		this.title = _title;
		 
		this.body = _body;
		 
		this.image = _image;
		 
		this.type = _type;
		 
		this.buyer = _buyer;
		 
		this.order = _order;
		
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
	 
	public OrderReviewType getType() 
	{
		return this.type;
	}

	public void setType(OrderReviewType newValue) 
	{
		this.type = newValue;
	}
	 
	public Buyer getBuyer() 
	{
		return this.buyer;
	}

	public void setBuyer(Buyer newValue) 
	{
		this.buyer = newValue;
	}
	 
	public Order getOrder() 
	{
		return this.order;
	}

	public void setOrder(Order newValue) 
	{
		this.order = newValue;
	}
	
}