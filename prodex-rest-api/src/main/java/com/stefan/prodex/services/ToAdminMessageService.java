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
 
@Path("/ToAdminMessage")
public class ToAdminMessageService {
 
	@GET
	@Produces("application/json")
	public ArrayList<ToAdminMessage> listtToAdminMessage() {
 
 		ArrayList<ToAdminMessage> result = new ArrayList<ToAdminMessage>();
		result.add(this.getToAdminMessage(0));
		result.add(this.getToAdminMessage(1));
		result.add(this.getToAdminMessage(2));
		result.add(this.getToAdminMessage(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public ToAdminMessage getToAdminMessage(@PathParam("id") int id) {
		ToAdminMessage item = new ToAdminMessage();
		item.setId(id);
		item.setSeller(0);
		item.setAdmin(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public ToAdminMessage createToAdminMessage(ToAdminMessage data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteToAdminMessage(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public ToAdminMessage updateToAdminMessage(@PathParam("id") int id, ToAdminMessage data) 
	{
		return data;
	}
}