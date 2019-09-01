package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.SellerReport;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class SellerReportStorage 
{
	private ArrayList<SellerReport> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader("/tmp/prodex_SellerReport.json");
			Type listOfMyClassObject = new TypeToken<ArrayList<SellerReport>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<SellerReport>();
	}

	private boolean save(ArrayList<SellerReport> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter("/tmp/prodex_SellerReport.json");
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public SellerReport get(int id) 
	{
		SellerReport result = null;
		ArrayList<SellerReport> items = this.load();
		for (SellerReport item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<SellerReport> list() 
	{
		return this.load();
	}

	public boolean create(SellerReport data) 
	{
		ArrayList<SellerReport> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<SellerReport> items = this.load();
		ArrayList<SellerReport> result = new ArrayList<>();
		for (SellerReport item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  SellerReport data) 
	{
		this.delete(id);
		return this.create(data);
	}
}