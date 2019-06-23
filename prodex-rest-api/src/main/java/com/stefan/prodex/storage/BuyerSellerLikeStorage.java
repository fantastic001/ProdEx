package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.BuyerSellerLike;

public class BuyerSellerLikeStorage 
{
	public BuyerSellerLike get(int id) 
	{
		return new BuyerSellerLike();
	}

	public ArrayList<BuyerSellerLike> list() 
	{
		return new ArrayList<BuyerSellerLike>();
	}

	public boolean create(BuyerSellerLike data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  BuyerSellerLike data) 
	{
		return true; 
	}
}