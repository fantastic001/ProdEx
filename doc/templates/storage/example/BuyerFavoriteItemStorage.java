package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.BuyerFavoriteItem;

public class BuyerFavoriteItemStorage 
{
	public BuyerFavoriteItem get(int id) 
	{
		return new BuyerFavoriteItem();
	}

	public ArrayList<BuyerFavoriteItem> list() 
	{
		return new ArrayList<BuyerFavoriteItem>();
	}

	public boolean create(BuyerFavoriteItem data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  BuyerFavoriteItem data) 
	{
		return true; 
	}
}