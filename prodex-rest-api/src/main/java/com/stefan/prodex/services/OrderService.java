package com.stefan.prodex.services;

import com.stefan.prodex.storage.OrderStorage;
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
 
@Path("/Order")
public class OrderService {
	private final OrderStorage storage = new OrderStorage();
 
	@Context private HttpServletRequest request;
	@GET
	@Produces("application/json")
	public ArrayList<Order> listOrder() {
 		return storage.list();
 
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Order getOrder(@PathParam("id") int id) {
		return storage.get(id);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Order createOrder(Order data) 
	{
		AuthManager<Order> auth = new AuthManager<>(request);
		Buyer buyer = auth.getCurrentBuyer();
		if (buyer == null) return null;
		data.setBuyer(buyer.getId()); 
		data.setStatus("PENDING");
		OrderStorage storage = new OrderStorage();
		storage.create(data);
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteOrder(@PathParam("id") int id) 
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
	public Order updateOrder(@PathParam("id") int id, Order data) 
	{
		if(storage.update(id, data)) return data;
		else return null;
	}
}
