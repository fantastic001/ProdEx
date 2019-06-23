package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.FromAdminMessage;

public class FromAdminMessageStorage 
{
	public FromAdminMessage get(int id) 
	{
		return new FromAdminMessage();
	}

	public ArrayList<FromAdminMessage> list() 
	{
		return new ArrayList<FromAdminMessage>();
	}

	public boolean create(FromAdminMessage data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  FromAdminMessage data) 
	{
		return true; 
	}
}