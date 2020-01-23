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
import com.stefan.prodex.storage.*;

@Path("/Buyer")
public class BuyerService {
	
	@Context private HttpServletRequest reequest;
	private final BuyerStorage storage = new BuyerStorage();

	@GET
	@Produces("application/json")
	public ArrayList<Buyer> listBuyer() {
 
 		return storage.list();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Buyer getBuyer(@PathParam("id") int id) {
		return storage.get(id);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Buyer createBuyer(Buyer data) 
	{
		if (storage.create(data)) return data;
		return null;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteBuyer(@PathParam("id") int id) 
	{
		if(storage.delete(id)) 
		{
			return Response.status(200).entity("{'status': 'deleted'}").build();
		}
		return Response.status(400).entity("{'status': 'error'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Buyer updateBuyer(@PathParam("id") int id, Buyer data) 
	{
		if(storage.update(id, data)) return data;
		else return null;
	}

	public Buyer findBuyerByUserId(int id) 
	{
		for (Buyer buyer : this.listBuyer()) if (buyer.getUser() == id) return buyer; 
		return null;
	}

	public Buyer getCurrentBuyer(HttpServletRequest request) 
	{
		User current = (new UserService()).getCurrentUser(request);
		if (current == null) return null; 
		return this.findBuyerByUserId(current.getId());
	}
}
