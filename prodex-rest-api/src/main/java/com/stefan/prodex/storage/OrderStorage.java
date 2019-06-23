package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Order;

public class OrderStorage 
{
	public Order get(int id) 
	{
		return new Order();
	}

	public ArrayList<Order> list() 
	{
		return new ArrayList<Order>();
	}

	public boolean create(Order data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Order data) 
	{
		return true; 
	}
}