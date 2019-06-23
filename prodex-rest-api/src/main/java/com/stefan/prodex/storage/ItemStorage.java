package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Item;

public class ItemStorage 
{
	public Item get(int id) 
	{
		return new Item();
	}

	public ArrayList<Item> list() 
	{
		return new ArrayList<Item>();
	}

	public boolean create(Item data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Item data) 
	{
		return true; 
	}
}