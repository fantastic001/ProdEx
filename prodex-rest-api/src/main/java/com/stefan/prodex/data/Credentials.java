package com.stefan.prodex.data;

import java.util.Date;

public class Credentials {
	
	
	private String userName; 
	
	private String password; 
	
	public Credentials() 
	{
	}
	public Credentials(String _userName, String _password) {
		super();
		 
		this.userName = _userName;
		 
		this.password = _password;
		
	}
	
	 
	public String getUserName() 
	{
		return this.userName;
	}

	public void setUserName(String newValue) 
	{
		this.userName = newValue;
	}
	 
	public String getPassword() 
	{
		return this.password;
	}

	public void setPassword(String newValue) 
	{
		this.password = newValue;
	}
	
}