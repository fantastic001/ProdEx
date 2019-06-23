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
 
@Path("/")
public class BuyerFavoriteItemService {
 
	@GET
	@Produces("application/json")
	public ArrayList<BuyerFavoriteItem> listtBuyerFavoriteItem() {
 
 		ArrayList<BuyerFavoriteItem> result = new ArrayList<BuyerFavoriteItem>();
		result.add(new BuyerFavoriteItem(
				/*"stefan", 
				"djfk;ldsjfl;kdjaslk;fdajkl",
				"Stefan",
				"Nozinic", 
				null, 
				"+381555333", 
				null, 
				"admin@prodex.com"*/
			));;
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public BuyerFavoriteItem getBuyerFavoriteItem(@PathParam("id") int id) {
 		ArrayList<BuyerFavoriteItem> result = new ArrayList<BuyerFavoriteItem>();
		result.add(new BuyerFavoriteItem(
				/*"stefan", 
				"djfk;ldsjfl;kdjaslk;fdajkl",
				"Stefan",
				"Nozinic", 
				null, 
				"+381555333", 
				null, 
				"admin@prodex.com"*/
			));
		return result.get(0);
		//return Response.status(200).entity(result.get(0)).build();
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public BuyerFavoriteItem createBuyerFavoriteItem(BuyerFavoriteItem data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteBuyerFavoriteItem(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public BuyerFavoriteItem updateBuyerFavoriteItem(@PathParam("id") int id, BuyerFavoriteItem data) 
	{
		return data;
	}
}