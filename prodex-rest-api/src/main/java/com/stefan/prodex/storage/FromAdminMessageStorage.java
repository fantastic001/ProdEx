package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.FromAdminMessage;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class FromAdminMessageStorage 
{
	private ArrayList<FromAdminMessage> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/tmp/prodex_FromAdminMessage.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<FromAdminMessage>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<FromAdminMessage>();
	}

	private boolean save(ArrayList<FromAdminMessage> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/tmp/prodex_FromAdminMessage.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public FromAdminMessage get(int id) 
	{
		FromAdminMessage result = null;
		ArrayList<FromAdminMessage> items = this.load();
		for (FromAdminMessage item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<FromAdminMessage> list() 
	{
		return this.load();
	}

	public boolean create(FromAdminMessage data) 
	{
		ArrayList<FromAdminMessage> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<FromAdminMessage> items = this.load();
		ArrayList<FromAdminMessage> result = new ArrayList<>();
		for (FromAdminMessage item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  FromAdminMessage data) 
	{
		this.delete(id);
		return this.create(data);
	}
}