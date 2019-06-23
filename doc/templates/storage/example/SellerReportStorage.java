package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.SellerReport;

public class SellerReportStorage 
{
	public SellerReport get(int id) 
	{
		return new SellerReport();
	}

	public ArrayList<SellerReport> list() 
	{
		return new ArrayList<SellerReport>();
	}

	public boolean create(SellerReport data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  SellerReport data) 
	{
		return true; 
	}
}