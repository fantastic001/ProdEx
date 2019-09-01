package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.Seller;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class SellerStorage 
{
	private ArrayList<Seller> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/tmp/prodex_Seller.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<Seller>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<Seller>();
	}

	private boolean save(ArrayList<Seller> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/tmp/prodex_Seller.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public Seller get(int id) 
	{
		Seller result = null;
		ArrayList<Seller> items = this.load();
		for (Seller item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<Seller> list() 
	{
		return this.load();
	}

	public boolean create(Seller data) 
	{
		ArrayList<Seller> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<Seller> items = this.load();
		ArrayList<Seller> result = new ArrayList<>();
		for (Seller item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  Seller data) 
	{
		this.delete(id);
		return this.create(data);
	}
}