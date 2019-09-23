package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.City;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class CityStorage 
{
	private ArrayList<City> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(StorageManager.getInstance().getJSONPath("City"));
			Type listOfMyClassObject = new TypeToken<ArrayList<City>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<City>();
	}

	private boolean save(ArrayList<City> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(StorageManager.getInstance().getJSONPath("City"));
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public City get(int id) 
	{
		City result = null;
		ArrayList<City> items = this.load();
		for (City item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<City> list() 
	{
		return this.load();
	}

	public boolean create(City data) 
	{
		ArrayList<City> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<City> items = this.load();
		ArrayList<City> result = new ArrayList<>();
		for (City item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  City data) 
	{
		this.delete(id);
		return this.create(data);
	}
}