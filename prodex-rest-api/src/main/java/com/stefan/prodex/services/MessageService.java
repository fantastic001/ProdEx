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
 
@Path("/Message")
public class MessageService {
 
	@GET
	@Produces("application/json")
	public ArrayList<Message> listtMessage() {
 
 		ArrayList<Message> result = new ArrayList<Message>();
		result.add(this.getMessage(0));
		result.add(this.getMessage(1));
		result.add(this.getMessage(2));
		result.add(this.getMessage(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Message getMessage(@PathParam("id") int id) {
		Message item = new Message();
		item.setId(id);
		item.setItem(0);
		item.setBuyer(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Message createMessage(Message data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteMessage(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Message updateMessage(@PathParam("id") int id, Message data) 
	{
		return data;
	}
}