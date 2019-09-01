package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.BuyerSellerLike;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class BuyerSellerLikeStorage 
{
	private ArrayList<BuyerSellerLike> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/tmp/prodex_BuyerSellerLike.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<BuyerSellerLike>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<BuyerSellerLike>();
	}

	private boolean save(ArrayList<BuyerSellerLike> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/tmp/prodex_BuyerSellerLike.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public BuyerSellerLike get(int id) 
	{
		BuyerSellerLike result = null;
		ArrayList<BuyerSellerLike> items = this.load();
		for (BuyerSellerLike item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<BuyerSellerLike> list() 
	{
		return this.load();
	}

	public boolean create(BuyerSellerLike data) 
	{
		ArrayList<BuyerSellerLike> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<BuyerSellerLike> items = this.load();
		ArrayList<BuyerSellerLike> result = new ArrayList<>();
		for (BuyerSellerLike item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  BuyerSellerLike data) 
	{
		this.delete(id);
		return this.create(data);
	}
}