package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Admin;

public class AdminStorage 
{
	public Admin get(int id) 
	{
		return new Admin();
	}

	public ArrayList<Admin> list() 
	{
		return new ArrayList<Admin>();
	}

	public boolean create(Admin data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Admin data) 
	{
		return true; 
	}
}