package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Seller;

public class SellerStorage 
{
	public Seller get(int id) 
	{
		return new Seller();
	}

	public ArrayList<Seller> list() 
	{
		return new ArrayList<Seller>();
	}

	public boolean create(Seller data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Seller data) 
	{
		return true; 
	}
}