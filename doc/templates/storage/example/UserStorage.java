package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.User;

public class UserStorage 
{
	public User get(int id) 
	{
		return new User();
	}

	public ArrayList<User> list() 
	{
		return new ArrayList<User>();
	}

	public boolean create(User data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  User data) 
	{
		return true; 
	}
}