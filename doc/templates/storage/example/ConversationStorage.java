package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Conversation;

public class ConversationStorage 
{
	public Conversation get(int id) 
	{
		return new Conversation();
	}

	public ArrayList<Conversation> list() 
	{
		return new ArrayList<Conversation>();
	}

	public boolean create(Conversation data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Conversation data) 
	{
		return true; 
	}
}