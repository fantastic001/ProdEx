package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.User;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class UserStorage 
{
	private ArrayList<User> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(System.getProperty("java.io.tmpdir") + "/prodex_User.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<User>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<User>();
	}

	private boolean save(ArrayList<User> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(System.getProperty("java.io.tmpdir") + "/prodex_User.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public User get(int id) 
	{
		User result = null;
		ArrayList<User> items = this.load();
		for (User item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<User> list() 
	{
		return this.load();
	}

	public boolean create(User data) 
	{
		ArrayList<User> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<User> items = this.load();
		ArrayList<User> result = new ArrayList<>();
		for (User item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  User data) 
	{
		this.delete(id);
		return this.create(data);
	}
}
