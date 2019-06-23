package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.ToAdminMessage;

public class ToAdminMessageStorage 
{
	public ToAdminMessage get(int id) 
	{
		return new ToAdminMessage();
	}

	public ArrayList<ToAdminMessage> list() 
	{
		return new ArrayList<ToAdminMessage>();
	}

	public boolean create(ToAdminMessage data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  ToAdminMessage data) 
	{
		return true; 
	}
}