package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.{{ component }};

public class {{ component }}Storage 
{
	public {{component}} get(int id) 
	{
		return new {{ component }}();
	}

	public ArrayList<{{component}}> list() 
	{
		return new ArrayList<{{ component }}>();
	}

	public boolean create({{ component }} data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  {{ component }} data) 
	{
		return true; 
	}
}
