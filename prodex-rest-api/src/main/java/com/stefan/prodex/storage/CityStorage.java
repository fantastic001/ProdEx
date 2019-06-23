package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.City;

public class CityStorage 
{
	public City get(int id) 
	{
		return new City();
	}

	public ArrayList<City> list() 
	{
		return new ArrayList<City>();
	}

	public boolean create(City data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  City data) 
	{
		return true; 
	}
}