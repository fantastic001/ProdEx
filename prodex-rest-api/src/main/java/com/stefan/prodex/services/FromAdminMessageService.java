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
 
@Path("/FromAdminMessage")
public class FromAdminMessageService {
 
	@GET
	@Produces("application/json")
	public ArrayList<FromAdminMessage> listtFromAdminMessage() {
 
 		ArrayList<FromAdminMessage> result = new ArrayList<FromAdminMessage>();
		result.add(this.getFromAdminMessage(0));
		result.add(this.getFromAdminMessage(1));
		result.add(this.getFromAdminMessage(2));
		result.add(this.getFromAdminMessage(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public FromAdminMessage getFromAdminMessage(@PathParam("id") int id) {
		FromAdminMessage item = new FromAdminMessage();
		item.setId(id);
		item.setAdmin(0);
		item.setUser(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public FromAdminMessage createFromAdminMessage(FromAdminMessage data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteFromAdminMessage(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public FromAdminMessage updateFromAdminMessage(@PathParam("id") int id, FromAdminMessage data) 
	{
		return data;
	}
}