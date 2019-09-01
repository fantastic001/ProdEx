package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.Item;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class ItemStorage 
{
	private ArrayList<Item> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/tmp/prodex_Item.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<Item>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<Item>();
	}

	private boolean save(ArrayList<Item> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/tmp/prodex_Item.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public Item get(int id) 
	{
		Item result = null;
		ArrayList<Item> items = this.load();
		for (Item item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<Item> list() 
	{
		return this.load();
	}

	public boolean create(Item data) 
	{
		ArrayList<Item> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<Item> items = this.load();
		ArrayList<Item> result = new ArrayList<>();
		for (Item item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  Item data) 
	{
		this.delete(id);
		return this.create(data);
	}
}