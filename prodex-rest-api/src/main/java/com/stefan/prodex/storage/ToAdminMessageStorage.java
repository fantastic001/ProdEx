package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.ToAdminMessage;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class ToAdminMessageStorage 
{
	private ArrayList<ToAdminMessage> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(StorageManager.getInstance().getJSONPath("ToAdminMessage"));
			Type listOfMyClassObject = new TypeToken<ArrayList<ToAdminMessage>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<ToAdminMessage>();
	}

	private boolean save(ArrayList<ToAdminMessage> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(StorageManager.getInstance().getJSONPath("ToAdminMessage"));
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public ToAdminMessage get(int id) 
	{
		ToAdminMessage result = null;
		ArrayList<ToAdminMessage> items = this.load();
		for (ToAdminMessage item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<ToAdminMessage> list() 
	{
		return this.load();
	}

	public boolean create(ToAdminMessage data) 
	{
		ArrayList<ToAdminMessage> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<ToAdminMessage> items = this.load();
		ArrayList<ToAdminMessage> result = new ArrayList<>();
		for (ToAdminMessage item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  ToAdminMessage data) 
	{
		this.delete(id);
		return this.create(data);
	}
}