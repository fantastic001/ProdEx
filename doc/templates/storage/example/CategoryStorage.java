package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.Category;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class CategoryStorage 
{
	private ArrayList<Category> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(StorageManager.getInstance().getJSONPath("Category"));
			Type listOfMyClassObject = new TypeToken<ArrayList<Category>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<Category>();
	}

	private boolean save(ArrayList<Category> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(StorageManager.getInstance().getJSONPath("Category"));
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public Category get(int id) 
	{
		Category result = null;
		ArrayList<Category> items = this.load();
		for (Category item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<Category> list() 
	{
		return this.load();
	}

	public boolean create(Category data) 
	{
		ArrayList<Category> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<Category> items = this.load();
		ArrayList<Category> result = new ArrayList<>();
		for (Category item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  Category data) 
	{
		this.delete(id);
		return this.create(data);
	}
}