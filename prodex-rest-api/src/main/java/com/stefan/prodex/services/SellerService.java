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
 
@Path("/Seller")
public class SellerService {
 
	@GET
	@Produces("application/json")
	public ArrayList<Seller> listSeller() {
 
 		ArrayList<Seller> result = new ArrayList<Seller>();
		result.add(this.getSeller(0));
		result.add(this.getSeller(1));
		result.add(this.getSeller(2));
		result.add(this.getSeller(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Seller getSeller(@PathParam("id") int id) {
		Seller item = new Seller();
		item.setId(id);
		item.setUser(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Seller createSeller(Seller data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteSeller(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Seller updateSeller(@PathParam("id") int id, Seller data) 
	{
		return data;
	}
	@Path("{id}/items")
	@GET
	@Produces("application/json")
	public ArrayList<Item> listSellerItems(@PathParam("id") int id) 
	{
		ItemService itemService = new ItemService();
		ArrayList<Item> items = itemService.listItem();
		ArrayList<Item> result = new ArrayList<>();
		for (Item item : items) 
		{
			if (item.getSeller() == id) 
			{
				result.add(item);
			}
		}
		return result; 
	}

	public Seller findSellerByUserId(int userId) 
	{
		for (Seller seller : this.listSeller()) if (seller.getUser() == userId) return seller;
		return null;
	}
}
