package com.stefan.prodex.services;
import com.stefan.prodex.storage.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import com.stefan.prodex.data.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.ws.rs.core.*;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Date;

public class AuthManager<T> 
{
	private HttpServletRequest request;

	public AuthManager(HttpServletRequest request) 
	{
		this.request = request; 
	}

	public User getCurrentUser() 
	{
		return (new UserService()).getCurrentUser(request); 
	}
	public Buyer getCurrentBuyer() 
	{
		return (new BuyerService()).getCurrentBuyer(request); 
	}
	public Seller getCurrentSeller() 
	{
		return (new SellerService()).getCurrentSeller(request); 
	}

	public T auth(AuthListener<T> listener) 
	{
		User user = this.getCurrentUser();
		if (user == null) return listener.otherwise();
		Buyer b = this.getCurrentBuyer();
		if (b != null) return listener.onBuyer(b);
		Seller s = this.getCurrentSeller();
		if (s != null) return listener.onSeller(s);
		Admin a = null;
		AdminService adminService = new AdminService(); 
		for (Admin item : adminService.listAdmin()) 
		{
			if (item.getUser() == user.getId()) a = item; 
		}
		if (a != null) return listener.onAdmin(a); 
		return listener.otherwise(); 
	}
}
