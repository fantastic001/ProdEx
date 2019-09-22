package com.stefan.prodex.storage;

public class StorageManager 
{
	
	private static StorageManager instance  = null; 

	public static StorageManager getInstance() 
	{
		if (instance == null) instance = new StorageManager();
		return instance;
	}
	public String getJSONPath(String model) 
	{
		return System.getProperty("java.io.tmpdir") + "/prodex_" + model + ".json";
	}
}
