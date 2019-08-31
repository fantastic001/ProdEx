package com.stefan.prodex.storage;


import com.google.gson.Gson;


import java.util.ArrayList;
import com.stefan.prodex.data.User;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class UserStorage 
{
	public User get(int id) 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/home/stefan/user.json");
			return gson.fromJson(reader, User.class);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return null;
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
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/home/stefan/user.json");
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
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
