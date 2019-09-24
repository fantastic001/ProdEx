package com.stefan.prodex.services;
import com.stefan.prodex.storage.*;

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
 
@Path("/Conversation")
public class ConversationService {
 
	@GET
	@Produces("application/json")
	public ArrayList<Conversation> listConversation() {
		return (new ConversationStorage()).list();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Conversation getConversation(@PathParam("id") int id) {
		Conversation item = new Conversation();
		item.setId(id);
		item.setUser(0);
		item.setInitialMessage(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Conversation createConversation(Conversation data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteConversation(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Conversation updateConversation(@PathParam("id") int id, Conversation data) 
	{
		return data;
	}
}
