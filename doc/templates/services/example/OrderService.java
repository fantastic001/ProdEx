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
 
@Path("/Order")
public class OrderService {
 
	@GET
	@Produces("application/json")
	public ArrayList<Order> listtOrder() {
 
 		ArrayList<Order> result = new ArrayList<Order>();
		result.add(this.getOrder(0));
		result.add(this.getOrder(1));
		result.add(this.getOrder(2));
		result.add(this.getOrder(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Order getOrder(@PathParam("id") int id) {
		Order item = new Order();
		item.setId(id);
		item.setBuyer(0);
		item.setItem(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Order createOrder(Order data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteOrder(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Order updateOrder(@PathParam("id") int id, Order data) 
	{
		return data;
	}
}