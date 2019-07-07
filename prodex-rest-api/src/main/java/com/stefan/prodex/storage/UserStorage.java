package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.User;

public class UserStorage 
{
	public User get(int id) 
	{
		User usr = new User();
		usr.setId(id);
		usr.setEmail("pusokurac@kurcinela.com");
		return usr; 
	}

	public ArrayList<User> list() 
	{
		ArrayList<User> list = new ArrayList<User>();
		for (int i = 0; i<10; i++)
			list.add(this.get(i));
		return list;
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