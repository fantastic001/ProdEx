package com.stefan.prodex.data;

import java.util.Date;

public class Item {
	
	
	private String name; 
	
	private String description; 
	
	private String image; 
	
	private Seller seller; 
	
	private float price; 
	
	private int likes; 
	
	private int dislikes; 
	
	private Date dueDate; 
	
	private Date creationDate; 
	
	private City city; 
	
	private boolean active; 
	
	private Category category; 
	
	public Item() 
	{
	}
	public Item(String _name, String _description, String _image, Seller _seller, float _price, int _likes, int _dislikes, Date _dueDate, Date _creationDate, City _city, boolean _active, Category _category) {
		super();
		 
		this.name = _name;
		 
		this.description = _description;
		 
		this.image = _image;
		 
		this.seller = _seller;
		 
		this.price = _price;
		 
		this.likes = _likes;
		 
		this.dislikes = _dislikes;
		 
		this.dueDate = _dueDate;
		 
		this.creationDate = _creationDate;
		 
		this.city = _city;
		 
		this.active = _active;
		 
		this.category = _category;
		
	}
	
	 
	public String getName() 
	{
		return this.name;
	}

	public void setName(String newValue) 
	{
		this.name = newValue;
	}
	 
	public String getDescription() 
	{
		return this.description;
	}

	public void setDescription(String newValue) 
	{
		this.description = newValue;
	}
	 
	public String getImage() 
	{
		return this.image;
	}

	public void setImage(String newValue) 
	{
		this.image = newValue;
	}
	 
	public Seller getSeller() 
	{
		return this.seller;
	}

	public void setSeller(Seller newValue) 
	{
		this.seller = newValue;
	}
	 
	public float getPrice() 
	{
		return this.price;
	}

	public void setPrice(float newValue) 
	{
		this.price = newValue;
	}
	 
	public int getLikes() 
	{
		return this.likes;
	}

	public void setLikes(int newValue) 
	{
		this.likes = newValue;
	}
	 
	public int getDislikes() 
	{
		return this.dislikes;
	}

	public void setDislikes(int newValue) 
	{
		this.dislikes = newValue;
	}
	 
	public Date getDueDate() 
	{
		return this.dueDate;
	}

	public void setDueDate(Date newValue) 
	{
		this.dueDate = newValue;
	}
	 
	public Date getCreationDate() 
	{
		return this.creationDate;
	}

	public void setCreationDate(Date newValue) 
	{
		this.creationDate = newValue;
	}
	 
	public City getCity() 
	{
		return this.city;
	}

	public void setCity(City newValue) 
	{
		this.city = newValue;
	}
	 
	public boolean getActive() 
	{
		return this.active;
	}

	public void setActive(boolean newValue) 
	{
		this.active = newValue;
	}
	 
	public Category getCategory() 
	{
		return this.category;
	}

	public void setCategory(Category newValue) 
	{
		this.category = newValue;
	}
	
}