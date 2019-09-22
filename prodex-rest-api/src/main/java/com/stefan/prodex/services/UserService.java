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
import javax.servlet.http.*;
import javax.ws.rs.core.*;

import java.util.Date;

@Path("/User")
public class UserService {
	@Context private HttpServletRequest request;

	@GET
	@Produces("application/json")
	public ArrayList<User> listtUser() {
		UserStorage storage = new UserStorage();
		return storage.list();
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public User getUser(@PathParam("id") int id) {
		User item = new User();
		item.setId(id);
		item.setCity(0);
		item.setFirstname("User");
		item.setEmail("someuser@example.com");
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public User createUser(User data) 
	{
		data.setPassword(Hasher.getSHA(data.getPassword()));
		data.setRegistrationDate(new Date());
		UserStorage userStorage = new UserStorage();
		userStorage.create(data);
		Buyer buyer = new Buyer(0, data.getId());
		BuyerStorage buyerStorage = new BuyerStorage();
		buyerStorage.create(buyer);
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

	@Path("me")
	@GET
	@Produces("application/json")
	public User getProfile() {
		return (User) request.getSession().getAttribute("user");
	}

}
