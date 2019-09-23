package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.Buyer;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class BuyerStorage 
{
	private ArrayList<Buyer> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(StorageManager.getInstance().getJSONPath("Buyer"));
			Type listOfMyClassObject = new TypeToken<ArrayList<Buyer>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<Buyer>();
	}

	private boolean save(ArrayList<Buyer> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(StorageManager.getInstance().getJSONPath("Buyer"));
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public Buyer get(int id) 
	{
		Buyer result = null;
		ArrayList<Buyer> items = this.load();
		for (Buyer item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<Buyer> list() 
	{
		return this.load();
	}

	public boolean create(Buyer data) 
	{
		ArrayList<Buyer> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<Buyer> items = this.load();
		ArrayList<Buyer> result = new ArrayList<>();
		for (Buyer item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  Buyer data) 
	{
		this.delete(id);
		return this.create(data);
	}
}