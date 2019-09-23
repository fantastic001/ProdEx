package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.Conversation;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class ConversationStorage 
{
	private ArrayList<Conversation> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(StorageManager.getInstance().getJSONPath("Conversation"));
			Type listOfMyClassObject = new TypeToken<ArrayList<Conversation>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<Conversation>();
	}

	private boolean save(ArrayList<Conversation> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(StorageManager.getInstance().getJSONPath("Conversation"));
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public Conversation get(int id) 
	{
		Conversation result = null;
		ArrayList<Conversation> items = this.load();
		for (Conversation item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<Conversation> list() 
	{
		return this.load();
	}

	public boolean create(Conversation data) 
	{
		ArrayList<Conversation> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<Conversation> items = this.load();
		ArrayList<Conversation> result = new ArrayList<>();
		for (Conversation item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  Conversation data) 
	{
		this.delete(id);
		return this.create(data);
	}
}