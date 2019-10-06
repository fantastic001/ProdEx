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
 
@Path("/Seller")
public class SellerService {
	
	@Context private HttpServletRequest request; 

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
	private APIStatus createSellerLike(int id, boolean liked) 
	{
		AuthManager<APIStatus> auth = new AuthManager<>(request);
		Buyer current = auth.getCurrentBuyer();
		if (current == null) return new APIStatus(-1, "not logged as buyer");
		BuyerSellerLikeService buyerSellerLikeService = new BuyerSellerLikeService();
		boolean found = false; 
		for (BuyerSellerLike like : buyerSellerLikeService.listBuyerSellerLike()) 
		{
			if (like.getSeller() == id && like.getBuyer() == current.getId()) return new APIStatus(-2, "Already likes/disliked");
		}
		buyerSellerLikeService.createBuyerSellerLike(new BuyerSellerLike(0, current.getId(), id, liked));
		return new APIStatus(0, "Submitted");
	}
	@Path("{id}/likes")
	@POST
	@Produces("application/json")
	public APIStatus likeSeller(@PathParam("id") int id) 
	{
		return this.createSellerLike(id, true);
	}
	@Path("{id}/dislikes")
	@POST
	@Produces("application/json")
	public APIStatus dislikeSeller(@PathParam("id") int id) 
	{
		return this.createSellerLike(id, false);
	}
	@Path("{id}/likes")
	@GET
	@Produces("application/json")
	public Integer getLikeCount(@PathParam("id") int id) 
	{
		BuyerSellerLikeService service = new BuyerSellerLikeService(); 
		int count = 0;
		for (BuyerSellerLike like : service.listBuyerSellerLike()) 
		{
			if (like.getSeller() == id && like.getLike()) count++;
		}
		return new Integer(count);
	}
	@Path("{id}/dislikes")
	@GET
	@Produces("application/json")
	public Integer getDislikeCount(@PathParam("id") int id) 
	{
		BuyerSellerLikeService service = new BuyerSellerLikeService(); 
		int count = 0;
		for (BuyerSellerLike like : service.listBuyerSellerLike()) 
		{
			if (like.getSeller() == id && !like.getLike()) count++;
		}
		return new Integer(count);
	}

	public Seller findSellerByUserId(int userId) 
	{
		for (Seller seller : this.listSeller()) if (seller.getUser() == userId) return seller;
		return null;
	}
	public Seller getCurrentSeller(HttpServletRequest request) 
	{
		User current = (new UserService()).getCurrentUser(request);
		if (current == null) return null; 
		return this.findSellerByUserId(current.getId());
	}
}
