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
 
@Path("/OrderReview")
public class OrderReviewService {
 
	@GET
	@Produces("application/json")
	public ArrayList<OrderReview> listtOrderReview() {
 
 		ArrayList<OrderReview> result = new ArrayList<OrderReview>();
		result.add(this.getOrderReview(0));
		result.add(this.getOrderReview(1));
		result.add(this.getOrderReview(2));
		result.add(this.getOrderReview(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public OrderReview getOrderReview(@PathParam("id") int id) {
		OrderReview item = new OrderReview();
		item.setId(id);
		item.setType(0);
		item.setBuyer(0);
		item.setOrder(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public OrderReview createOrderReview(OrderReview data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteOrderReview(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public OrderReview updateOrderReview(@PathParam("id") int id, OrderReview data) 
	{
		return data;
	}
}