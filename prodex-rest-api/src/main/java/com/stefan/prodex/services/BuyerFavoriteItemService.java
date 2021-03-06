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
import com.stefan.prodex.storage.*;
 
@Path("/BuyerFavoriteItem")
public class BuyerFavoriteItemService {
 
 	private final BuyerFavoriteItemStorage storage = new BuyerFavoriteItemStorage();
	@GET
	@Produces("application/json")
	public ArrayList<BuyerFavoriteItem> listtBuyerFavoriteItem() {
 
 		return storage.list();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public BuyerFavoriteItem getBuyerFavoriteItem(@PathParam("id") int id) {
		return storage.get(id);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public BuyerFavoriteItem createBuyerFavoriteItem(BuyerFavoriteItem data) 
	{
		if (storage.create(data)) return data;
		return null;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteBuyerFavoriteItem(@PathParam("id") int id) 
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
	public BuyerFavoriteItem updateBuyerFavoriteItem(@PathParam("id") int id, BuyerFavoriteItem data) 
	{
		if(storage.update(id, data)) return data;
		else return null;
	}
}
