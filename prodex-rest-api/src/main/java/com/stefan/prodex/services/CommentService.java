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
 
@Path("/Comment")
public class CommentService {
 	private final CommentStorage storage = new CommentStorage();
	@GET
	@Produces("application/json")
	public ArrayList<Comment> listComment() {
		 return storage.list();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Comment getComment(@PathParam("id") int id) {
		return storage.get(id);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Comment createComment(Comment data) 
	{
		if (storage.create(data)) return data; 
		return null;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteComment(@PathParam("id") int id) 
	{
		storage.delete(id);
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Comment updateComment(@PathParam("id") int id, Comment data) 
	{
		if (storage.update(id, data)) return data; 
		return null;
	}
}
