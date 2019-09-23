package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.{{ component }};
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class {{ component }}Storage 
{
	private ArrayList<{{ component }}> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(StorageManager.getInstance().getJSONPath("{{ component }}"));
			Type listOfMyClassObject = new TypeToken<ArrayList<{{ component }}>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<{{ component }}>();
	}

	private boolean save(ArrayList<{{ component }}> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(StorageManager.getInstance().getJSONPath("{{ component }}"));
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public {{ component }} get(int id) 
	{
		{{ component }} result = null;
		ArrayList<{{ component }}> items = this.load();
		for ({{ component }} item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<{{ component }}> list() 
	{
		return this.load();
	}

	public boolean create({{ component }} data) 
	{
		ArrayList<{{ component }}> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<{{ component }}> items = this.load();
		ArrayList<{{ component }}> result = new ArrayList<>();
		for ({{ component }} item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  {{ component }} data) 
	{
		this.delete(id);
		return this.create(data);
	}
}
