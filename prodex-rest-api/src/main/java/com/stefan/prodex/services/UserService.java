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

	private final UserStorage storage = new UserStorage();
	@GET
	@Produces("application/json")
	public ArrayList<User> listUser() {

		return storage.list();
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public User getUser(@PathParam("id") int id) {
		return storage.get(id);
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
		if(storage.delete(id)) 
		{
			return Response.status(200).entity("{'status': 'deleted'}").build();
		}
		return Response.status(400).entity("{'status': 'error'}").build();
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
	public User getCurrentUser(HttpServletRequest request) 
	{
		if (request == null) return null;
		HttpSession session = request.getSession(true);
		if (session == null) return null;
		if (session.getAttribute("user") == null) 
		{
			return null; // user not logged in
		}
		User current = (User) session.getAttribute("user");
		return current;
	}

}
