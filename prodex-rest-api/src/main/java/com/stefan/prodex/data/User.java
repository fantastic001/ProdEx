package com.stefan.prodex.data;

import java.util.Date;

public class User {
	private int id;
	
	private String username; 
	
	private String password; 
	
	private String firstname; 
	
	private String lastname; 
	
	private String phone; 
	
	private int city; 
	
	private String email; 
	
	private Date registrationDate; 
	
	public User() 
	{
	}
	public User(int id, String _username, String _password, String _firstname, String _lastname, String _phone, int _city, String _email, Date _registrationDate) {
		super();
		this.id = id;
		 
		this.username = _username;
		 
		this.password = _password;
		 
		this.firstname = _firstname;
		 
		this.lastname = _lastname;
		 
		this.phone = _phone;
		 
		this.city = _city;
		 
		this.email = _email;
		 
		this.registrationDate = _registrationDate;
		
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return this.id;
	}
	 
	public String getUsername() 
	{
		return this.username;
	}

	public void setUsername(String newValue) 
	{
		this.username = newValue;
	}
	 
	public String getPassword() 
	{
		return this.password;
	}

	public void setPassword(String newValue) 
	{
		this.password = newValue;
	}
	 
	public String getFirstname() 
	{
		return this.firstname;
	}

	public void setFirstname(String newValue) 
	{
		this.firstname = newValue;
	}
	 
	public String getLastname() 
	{
		return this.lastname;
	}

	public void setLastname(String newValue) 
	{
		this.lastname = newValue;
	}
	 
	public String getPhone() 
	{
		return this.phone;
	}

	public void setPhone(String newValue) 
	{
		this.phone = newValue;
	}
	 
	public int getCity() 
	{
		return this.city;
	}

	public void setCity(int newValue) 
	{
		this.city = newValue;
	}
	 
	public String getEmail() 
	{
		return this.email;
	}

	public void setEmail(String newValue) 
	{
		this.email = newValue;
	}
	 
	public Date getRegistrationDate() 
	{
		return this.registrationDate;
	}

	public void setRegistrationDate(Date newValue) 
	{
		this.registrationDate = newValue;
	}
	
}