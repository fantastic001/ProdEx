package com.stefan.prodex.data;

import java.util.Date;

public class Item {
	private int id;
	
	private String name; 
	
	private String description; 
	
	private String image; 
	
	private int seller; 
	
	private float price; 
	
	private int likes; 
	
	private int dislikes; 
	
	private Date dueDate; 
	
	private Date creationDate; 
	
	private int city; 
	
	private boolean active; 
	
	private boolean shipped; 
	
	private int category; 
	
	public Item() 
	{
	}
	public Item(int id, String _name, String _description, String _image, int _seller, float _price, int _likes, int _dislikes, Date _dueDate, Date _creationDate, int _city, boolean _active, boolean _shipped, int _category) {
		super();
		this.id = id;
		 
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
		 
		this.shipped = _shipped;
		 
		this.category = _category;
		
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
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
	 
	public int getSeller() 
	{
		return this.seller;
	}

	public void setSeller(int newValue) 
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
	 
	public int getCity() 
	{
		return this.city;
	}

	public void setCity(int newValue) 
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
	 
	public boolean getShipped() 
	{
		return this.shipped;
	}

	public void setShipped(boolean newValue) 
	{
		this.shipped = newValue;
	}
	 
	public int getCategory() 
	{
		return this.category;
	}

	public void setCategory(int newValue) 
	{
		this.category = newValue;
	}
	
}