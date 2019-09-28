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
 
@Path("/Buyer")
public class BuyerService {
 
	@GET
	@Produces("application/json")
	public ArrayList<Buyer> listBuyer() {
 
 		ArrayList<Buyer> result = new ArrayList<Buyer>();
		result.add(this.getBuyer(0));
		result.add(this.getBuyer(1));
		result.add(this.getBuyer(2));
		result.add(this.getBuyer(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Buyer getBuyer(@PathParam("id") int id) {
		Buyer item = new Buyer();
		item.setId(id);
		item.setUser(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Buyer createBuyer(Buyer data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteBuyer(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Buyer updateBuyer(@PathParam("id") int id, Buyer data) 
	{
		return data;
	}

	public Buyer findBuyerByUserId(int id) 
	{
		for (Buyer buyer : this.listBuyer()) if (buyer.getUser() == id) return buyer; 
		return null;
	}

	public Buyer getCurrentBuyer() 
	{
		User current = (new UserService()).getCurrentUser();
		if (current == null) return null; 
		return this.findBuyerByUserId(current.getId());
	}
}
