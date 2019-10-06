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
 
@Path("/Admin")
public class AdminService {
 
	@GET
	@Produces("application/json")
	public ArrayList<Admin> listAdmin() {
 
 		ArrayList<Admin> result = new ArrayList<Admin>();
		result.add(this.getAdmin(0));
		result.add(this.getAdmin(1));
		result.add(this.getAdmin(2));
		result.add(this.getAdmin(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Admin getAdmin(@PathParam("id") int id) {
		Admin item = new Admin();
		item.setId(id);
		item.setUser(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Admin createAdmin(Admin data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteAdmin(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Admin updateAdmin(@PathParam("id") int id, Admin data) 
	{
		return data;
	}
}
