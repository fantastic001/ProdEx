package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.ItemReport;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class ItemReportStorage 
{
	private ArrayList<ItemReport> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/tmp/prodex_ItemReport.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<ItemReport>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<ItemReport>();
	}

	private boolean save(ArrayList<ItemReport> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/tmp/prodex_ItemReport.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public ItemReport get(int id) 
	{
		ItemReport result = null;
		ArrayList<ItemReport> items = this.load();
		for (ItemReport item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<ItemReport> list() 
	{
		return this.load();
	}

	public boolean create(ItemReport data) 
	{
		ArrayList<ItemReport> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<ItemReport> items = this.load();
		ArrayList<ItemReport> result = new ArrayList<>();
		for (ItemReport item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  ItemReport data) 
	{
		this.delete(id);
		return this.create(data);
	}
}