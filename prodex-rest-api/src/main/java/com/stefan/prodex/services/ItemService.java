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
import com.stefan.prodex.storage.*;
 
@Path("/Item")
public class ItemService {
	private final ItemStorage storage = new ItemStorage();
	
	@Context private HttpServletRequest request;
 
	@GET
	@Produces("application/json")
	public ArrayList<Item> listItem() {
 		return storage.list();
 
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Item getItem(@PathParam("id") int id) {
		return storage.get(id);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Item createItem(Item data) 
	{
		if (storage.create(data)) return data;
		return null;
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
		if (!ordered) return new APIStatus(-1, "Not ordered");
		if (shipping == 0 && shipped == 0) return new APIStatus(0, "PENDING");
		else if (shipped == 0) return new APIStatus(1, "SHIPPING");
		else return new APIStatus(2, "SHIPPED");
	}
	
	@Path("{id}/status")
	@POST
	@Produces("application/json")
	public APIStatus updateItemStatus(@PathParam("id") final int id) 
	{
		AuthManager<APIStatus> auth = new AuthManager<APIStatus>(request);
		final Item curr = this.getItem(id);
		if (curr == null) 
		{
			return new APIStatus(-2, "No such item");
		}
		return auth.auth(this, new AuthListener<APIStatus>() 
		{
			public APIStatus onAdmin(Admin a, Object service) 
			{
				return new APIStatus(-2, "Administrator cannot change itemm sttate");
			}
			public APIStatus onBuyer(Buyer b, Object service) {
				return new APIStatus(-5, "Buyer not allowed to change item status");
			}
			public APIStatus onSeller(Seller s, Object service) {
				if (s.getId() == curr.getSeller()) 
				{
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
					curr.setShipped(order.getStatus().equals("SHIPPED"));
					((ItemService) service).updateItem(id, curr);
					return new APIStatus(1, "OK");

								
				}
				else 
				{
					return new APIStatus(-4, "This seller is not allowed to change other seller's item");
				}
			}
			public APIStatus otherwise(Object service) 
			{
				return new APIStatus(-3, "Not logged in");
			}
		});

	}
	
	@Path("{id}/message")
	@POST
	@Produces("application/json")
	public Message sendMessage(@PathParam("id") int id, Message message) 
	{
		message.setItem(id);
		return (new MessageService()).createMessage(message);
	}

	@Path("{id}/comments")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Comment commentItem(@PathParam("id") int id, Comment comment) 
	{
		User user = (new UserService()).getCurrentUser(request);
		if (user == null) return null; 
		CommentService commentService = new CommentService();
		comment.setItem(id);
		comment.setUser(user.getId());
		return commentService.createComment(comment);
	}

	@Path("{id}/comments")
	@GET
	@Produces("application/json")
	@Consumes("application/json")
	public ArrayList<Comment> getComments(@PathParam("id") int id) 
	{
		AuthManager<ArrayList<Comment>> auth = new  AuthManager<>(request);
		CommentService commentService = new CommentService();
		User user = auth.getCurrentUser();
		ArrayList<Comment> result = new ArrayList<>();
		for (Comment comment : commentService.listComment()) 
		{
			if (comment.getItem() == id) result.add(comment);
		}
		return result;
	}

}
