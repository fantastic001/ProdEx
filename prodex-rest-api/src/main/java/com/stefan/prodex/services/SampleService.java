package com.stefan.prodex.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.stefan.prodex.data.*;
import java.util.ArrayList;
 
@Path("/sample")
public class SampleService {
 
	@GET
	@Produces("application/json")
	public ArrayList<User> getSample() {
 
 		ArrayList<User> result = new ArrayList<User>();
		result.add(new User(
				"stefan", 
				"djfk;ldsjfl;kdjaslk;fdajkl",
				"Stefan",
				"Nozinic", 
				User.UserType.ADMIN,
				null, 
				"+381555333", 
				null, 
				"admin@prodex.com"
			));;
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public User getSampleId(@PathParam("id") int id) {
 		ArrayList<User> result = new ArrayList<User>();
		result.add(new User(
				"stefan", 
				"djfk;ldsjfl;kdjaslk;fdajkl",
				"Stefan",
				"Nozinic", 
				User.UserType.ADMIN,
				null, 
				"+381555333", 
				null, 
				"admin@prodex.com"
			));
		return result.get(0);
		//return Response.status(200).entity(result.get(0)).build();
	}
}
