package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.Admin;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class AdminStorage 
{
	private ArrayList<Admin> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/tmp/prodex_Admin.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<Admin>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<Admin>();
	}

	private boolean save(ArrayList<Admin> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/tmp/prodex_Admin.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public Admin get(int id) 
	{
		Admin result = null;
		ArrayList<Admin> items = this.load();
		for (Admin item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<Admin> list() 
	{
		return this.load();
	}

	public boolean create(Admin data) 
	{
		ArrayList<Admin> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<Admin> items = this.load();
		ArrayList<Admin> result = new ArrayList<>();
		for (Admin item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  Admin data) 
	{
		this.delete(id);
		return this.create(data);
	}
}