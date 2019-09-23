package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.OrderReview;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class OrderReviewStorage 
{
	private ArrayList<OrderReview> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(StorageManager.getInstance().getJSONPath("OrderReview"));
			Type listOfMyClassObject = new TypeToken<ArrayList<OrderReview>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<OrderReview>();
	}

	private boolean save(ArrayList<OrderReview> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(StorageManager.getInstance().getJSONPath("OrderReview"));
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public OrderReview get(int id) 
	{
		OrderReview result = null;
		ArrayList<OrderReview> items = this.load();
		for (OrderReview item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<OrderReview> list() 
	{
		return this.load();
	}

	public boolean create(OrderReview data) 
	{
		ArrayList<OrderReview> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<OrderReview> items = this.load();
		ArrayList<OrderReview> result = new ArrayList<>();
		for (OrderReview item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  OrderReview data) 
	{
		this.delete(id);
		return this.create(data);
	}
}