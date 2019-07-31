package com.stefan.prodex.data;

import java.util.Date;

public class APIStatus {
	
	
	private int code; 
	
	private String message; 
	
	public APIStatus() 
	{
	}
	public APIStatus(int _code, String _message) {
		super();
		 
		this.code = _code;
		 
		this.message = _message;
		
	}
	
	 
	public int getCode() 
	{
		return this.code;
	}

	public void setCode(int newValue) 
	{
		this.code = newValue;
	}
	 
	public String getMessage() 
	{
		return this.message;
	}

	public void setMessage(String newValue) 
	{
		this.message = newValue;
	}
	
}