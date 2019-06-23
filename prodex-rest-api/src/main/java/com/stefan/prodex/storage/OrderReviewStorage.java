package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.OrderReview;

public class OrderReviewStorage 
{
	public OrderReview get(int id) 
	{
		return new OrderReview();
	}

	public ArrayList<OrderReview> list() 
	{
		return new ArrayList<OrderReview>();
	}

	public boolean create(OrderReview data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  OrderReview data) 
	{
		return true; 
	}
}