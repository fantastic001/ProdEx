package com.stefan.prodex.storage;


import com.google.gson.*;
import com.google.gson.reflect.*;
import java.lang.reflect.Type;


import java.util.ArrayList;
import com.stefan.prodex.data.Comment;
import com.stefan.prodex.services.Hasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class CommentStorage 
{
	private ArrayList<Comment> load() 
	{
		Gson gson = new Gson();
		try 
		{
			Reader reader = new FileReader(StorageManager.getInstance().getJSONPath("Comment"));
			Type listOfMyClassObject = new TypeToken<ArrayList<Comment>>() {}.getType();
			return gson.fromJson(reader, listOfMyClassObject);
		}  catch (IOException e) {
            		e.printStackTrace();
        	}
		return new ArrayList<Comment>();
	}

	private boolean save(ArrayList<Comment> data) 
	{
		Gson gson = new Gson();
		try {
		    FileWriter writer = new FileWriter(StorageManager.getInstance().getJSONPath("Comment"));
		    
		    gson.toJson(data, writer);
		    writer.close();
               } catch (IOException e) {
                    e.printStackTrace();
		    return false; 
               }
	       return true;
	}
	public Comment get(int id) 
	{
		Comment result = null;
		ArrayList<Comment> items = this.load();
		for (Comment item : items) 
		{
			if (item.getId() == id) result = item;
		}
		return result;
	}

	public ArrayList<Comment> list() 
	{
		return this.load();
	}

	public boolean create(Comment data) 
	{
		ArrayList<Comment> items = this.load();
		data.setId(items.size());
		items.add(data);
		return this.save(items);
	}

	public boolean delete(int id) 
	{
		ArrayList<Comment> items = this.load();
		ArrayList<Comment> result = new ArrayList<>();
		for (Comment item : items) 
		{
			if (item.getId() != id) result.add(item);
		}
		return this.save(result);
	}
	public boolean update(int id,  Comment data) 
	{
		this.delete(id);
		return this.create(data);
	}
}