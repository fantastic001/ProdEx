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
 
@Path("/BuyerSellerLike")
public class BuyerSellerLikeService {
	@Context private HttpServletRequest request; 
	private final BuyerSellerLikeStorage storage = new BuyerSellerLikeStorage();
 
	@GET
	@Produces("application/json")
	public ArrayList<BuyerSellerLike> listBuyerSellerLike() {
		return storage.list(); 
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public BuyerSellerLike getBuyerSellerLike(@PathParam("id") int id) {
		return storage.get(id);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public BuyerSellerLike createBuyerSellerLike(BuyerSellerLike data) 
	{
		if (storage.create(data)) return data; 
		return null;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteBuyerSellerLike(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'not allowed'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public BuyerSellerLike updateBuyerSellerLike(@PathParam("id") int id, BuyerSellerLike data) 
	{
		storage.update(id, data);
		return data;
	}
}
