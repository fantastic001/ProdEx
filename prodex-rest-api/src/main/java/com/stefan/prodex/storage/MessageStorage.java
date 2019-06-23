package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Message;

public class MessageStorage 
{
	public Message get(int id) 
	{
		return new Message();
	}

	public ArrayList<Message> list() 
	{
		return new ArrayList<Message>();
	}

	public boolean create(Message data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Message data) 
	{
		return true; 
	}
}