package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Category;

public class CategoryStorage 
{
	public Category get(int id) 
	{
		return new Category();
	}

	public ArrayList<Category> list() 
	{
		return new ArrayList<Category>();
	}

	public boolean create(Category data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Category data) 
	{
		return true; 
	}
}