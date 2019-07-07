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

import com.stefan.prodex.storage.*;

@Path("/User")
public class UserService {
 
	@GET
	@Produces("application/json")
	public ArrayList<User> listtUser() {
 
 		return new UserStorage().list();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public User getUser(@PathParam("id") int id) {
 		return new UserStorage().get(id);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public User createUser(User data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteUser(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public User updateUser(@PathParam("id") int id, User data) 
	{
		return data;
	}
}
