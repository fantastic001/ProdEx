package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.ItemReport;

public class ItemReportStorage 
{
	public ItemReport get(int id) 
	{
		return new ItemReport();
	}

	public ArrayList<ItemReport> list() 
	{
		return new ArrayList<ItemReport>();
	}

	public boolean create(ItemReport data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  ItemReport data) 
	{
		return true; 
	}
}