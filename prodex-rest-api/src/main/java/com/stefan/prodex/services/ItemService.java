package com.stefan.prodex.services;

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

import com.stefan.prodex.storage.ItemStorage;
 
@Path("/Item")
public class ItemService {
	
	@Context private HttpServletRequest request;
 
	@GET
	@Produces("application/json")
	public ArrayList<Item> listtItem() {
 
 		ArrayList<Item> result = new ArrayList<Item>();
		result.add(this.getItem(0));
		result.add(this.getItem(1));
		result.add(this.getItem(2));
		result.add(this.getItem(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Item getItem(@PathParam("id") int id) {
		Item item = new Item();
		item.setId(id);
		item.setSeller(0);
		item.setCity(0);
		item.setCategory(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Item createItem(Item data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteItem(@PathParam("id") int id) 
	{
		if (this.getItemStatus(id).getCode() > 0) 
			return Response.status(403).entity("{'status': 'error'}").build();
		ItemStorage storage = new ItemStorage();
		storage.delete(id);
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Item updateItem(@PathParam("id") int id, Item data) 
	{
		return data;
	}
	
	@Path("{id}/status")
	@GET
	@Produces("application/json")
	public APIStatus getItemStatus(@PathParam("id") int id) 
	{
		OrderService orderService = new OrderService();
		ArrayList<Order> orders = orderService.listOrder();
		int pending = 0, shipping = 0, shipped = 0; 
		boolean ordered = false; 
		for (Order o : orders) 
		{
			if (o.getItem() == id) 
			{
				ordered = true;
				if (o.getStatus().equals("SHIPPING")) shipping++;
				if (o.getStatus().equals("SHIPPED")) shipped++;
				else pending++;
			}
		}
		if (!ordered) return new APIStatus(-1, "Not ordered")
		if (shipping == 0 && shipped == 0) return new APIStatus(0, "PENDING");
		else if (shipped == 0) return new APIStatus(1, "SHIPPING");
		else return new APIStatus(2, "SHIPPED");
	}
	
	@Path("{id}/status")
	@POST
	@Produces("application/json")
	public APIStatus updateItemStatus(@PathParam("id") int id) 
	{
		Item curr = this.getItem(id);
		// check if current user is seller of this item
		SellerService sellerService = new SellerService();
		Seller seller = sellerService.getSeller(curr.getSeller());
		UserService userService = new UserService();
		User logged =  (User) request.getSession().getAttribute("user");
		if (logged == null) return new APIStatus(-5, "Not logged in");
		if (! userService.getUser(seller.getUser()).getUsername().equals( logged.getUsername() )) return new APIStatus(-4, "Not allowed");
		OrderService orderService = new OrderService();
		ArrayList<Order> orders = orderService.listOrder();
		Order order = null;
		int pending = 0, shipping = 0, shipped = 0; 
		for (Order o : orders) 
		{
			if (o.getItem() == id) 
			{
				order = o;
				if (o.getStatus().equals("SHIPPING")) shipping++;
				if (o.getStatus().equals("SHIPPED")) shipped++;
				else pending++;
				break;
			}
		}
		if (order == null) return new APIStatus(-1, "No orders");
		if (shipping == 0 && shipped == 0) order.setStatus("SHIPPING");
		else if (shipped == 0) order.setStatus("SHIPPED");
		if (curr != null) 
		{
			curr.setShipped(order.getStatus().equals("SHIPPED"));
			this.updateItem(id, curr);
			return new APIStatus(1, "OK");
		}
		else
		{
			return new APIStatus(-2, "No such item");
		}

	}
}
