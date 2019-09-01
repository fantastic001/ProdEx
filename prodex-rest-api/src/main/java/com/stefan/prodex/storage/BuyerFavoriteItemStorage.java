package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.BuyerFavoriteItem;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class BuyerFavoriteItemStorage 
{
	private ArrayList<BuyerFavoriteItem> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/tmp/prodex_BuyerFavoriteItem.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<BuyerFavoriteItem>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<BuyerFavoriteItem>();
	}

	private boolean save(ArrayList<BuyerFavoriteItem> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/tmp/prodex_BuyerFavoriteItem.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public BuyerFavoriteItem get(int id) 
	{
		BuyerFavoriteItem result = null;
		ArrayList<BuyerFavoriteItem> items = this.load();
		for (BuyerFavoriteItem item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<BuyerFavoriteItem> list() 
	{
		return this.load();
	}

	public boolean create(BuyerFavoriteItem data) 
	{
		ArrayList<BuyerFavoriteItem> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<BuyerFavoriteItem> items = this.load();
		ArrayList<BuyerFavoriteItem> result = new ArrayList<>();
		for (BuyerFavoriteItem item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  BuyerFavoriteItem data) 
	{
		this.delete(id);
		return this.create(data);
	}
}