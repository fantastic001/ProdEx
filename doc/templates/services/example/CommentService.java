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
 
@Path("/Comment")
public class CommentService {
 
	@GET
	@Produces("application/json")
	public ArrayList<Comment> listtComment() {
 
 		ArrayList<Comment> result = new ArrayList<Comment>();
		result.add(this.getComment(0));
		result.add(this.getComment(1));
		result.add(this.getComment(2));
		result.add(this.getComment(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Comment getComment(@PathParam("id") int id) {
		Comment item = new Comment();
		item.setId(id);
		item.setItem(0);
		item.setUser(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Comment createComment(Comment data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteComment(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Comment updateComment(@PathParam("id") int id, Comment data) 
	{
		return data;
	}
}