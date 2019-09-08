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

import com.stefan.prodex.storage.ItemStorage;
 
@Path("/Item")
public class ItemService {
 
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
		for (Order o : orders) 
		{
			if (o.getItem() == id) 
			{
				if (o.getStatus().equals("SHIPPING")) shipping++;
				if (o.getStatus().equals("SHIPPED")) shipped++;
				else pending++;
			}
		}
		if (shipping == 0 && shipped == 0) return new APIStatus(0, "PENDING");
		else if (shipped == 0) return new APIStatus(1, "SHIPPING");
		else return new APIStatus(2, "SHIPPED");
	}
}
