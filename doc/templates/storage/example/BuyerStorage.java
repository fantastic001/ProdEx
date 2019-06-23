package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Buyer;

public class BuyerStorage 
{
	public Buyer get(int id) 
	{
		return new Buyer();
	}

	public ArrayList<Buyer> list() 
	{
		return new ArrayList<Buyer>();
	}

	public boolean create(Buyer data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Buyer data) 
	{
		return true; 
	}
}