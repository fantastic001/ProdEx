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
	public static boolean ENABLE_TESTING = false; 
	public static boolean LOGIN_SELLER = false;
	public static boolean LOGIN_ADMIN = false;
	public static boolean LOGIN_BUYER = false;
	private HttpServletRequest request;

	public AuthManager(HttpServletRequest request) 
	{
		this.request = request; 
	}

	public User getCurrentUser() 
	{
		if (!this.ENABLE_TESTING) return (new UserService()).getCurrentUser(request); 
		// here we will  find user based on testing params 
		if (this.LOGIN_BUYER) 
		{
			BuyerService service = new BuyerService();
			Buyer x = service.listBuyer().get(0);
			UserService userService = new UserService();
			for (User user : userService.listUser()) 
			{
				if (user.getId() == x.getUser()) return user;
			}
			return null;
		}
		if (this.LOGIN_SELLER) 
		{
			SellerService service = new SellerService();
			Seller x = service.listSeller().get(0);
			UserService userService = new UserService();
			for (User user : userService.listUser()) 
			{
				if (user.getId() == x.getUser()) return user;
			}
			return null;
		}
		if (this.LOGIN_ADMIN) 
		{
			AdminService service = new AdminService();
			Admin x = service.listAdmin().get(0);
			UserService userService = new UserService();
			for (User user : userService.listUser()) 
			{
				if (user.getId() == x.getUser()) return user;
			}
			return null;
		}
		return null;
	}
	public Buyer getCurrentBuyer() 
	{
		if (!this.ENABLE_TESTING) return (new BuyerService()).getCurrentBuyer(request); 
		return (new BuyerService()).listBuyer().get(0);
	}
	public Seller getCurrentSeller() 
	{
		if (!this.ENABLE_TESTING) return (new SellerService()).getCurrentSeller(request); 
		return (new SellerService()).listSeller().get(0);
	}

	public T auth(Object service, AuthListener<T> listener) 
	{
		User user = this.getCurrentUser();
		if (user == null) return listener.otherwise(service);
		Buyer b = this.getCurrentBuyer();
		if (b != null) return listener.onBuyer(b, service);
		Seller s = this.getCurrentSeller();
		if (s != null) return listener.onSeller(s, service);
		Admin a = null;
		AdminService adminService = new AdminService(); 
		if (!this.ENABLE_TESTING) {
			for (Admin item : adminService.listAdmin()) 
			{
				if (item.getUser() == user.getId()) a = item; 
			}
			if (a != null) return listener.onAdmin(a, service); 
		}
		else 
		{
			return listener.onAdmin(adminService.listAdmin().get(0), service);
		}
		return listener.otherwise(service); 
	}
}
