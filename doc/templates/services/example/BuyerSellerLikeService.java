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
 
@Path("/BuyerSellerLike")
public class BuyerSellerLikeService {
 
	@GET
	@Produces("application/json")
	public ArrayList<BuyerSellerLike> listtBuyerSellerLike() {
 
 		ArrayList<BuyerSellerLike> result = new ArrayList<BuyerSellerLike>();
		result.add(new BuyerSellerLike(
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
	public BuyerSellerLike getBuyerSellerLike(@PathParam("id") int id) {
 		ArrayList<BuyerSellerLike> result = new ArrayList<BuyerSellerLike>();
		result.add(new BuyerSellerLike(
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
	public BuyerSellerLike createBuyerSellerLike(BuyerSellerLike data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteBuyerSellerLike(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public BuyerSellerLike updateBuyerSellerLike(@PathParam("id") int id, BuyerSellerLike data) 
	{
		return data;
	}
}