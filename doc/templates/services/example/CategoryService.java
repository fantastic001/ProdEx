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
 
@Path("/Category")
public class CategoryService {
 
	@GET
	@Produces("application/json")
	public ArrayList<Category> listtCategory() {
 
 		ArrayList<Category> result = new ArrayList<Category>();
		result.add(new Category(
				/*"stefan", 
				"djfk;ldsjfl;kdjaslk;fdajkl",
				"Stefan",
				"Nozinic", 
				null, 
				"+381555333", 
				null, 
				"admin@prodex.com"*/
			));;
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Category getCategory(@PathParam("id") int id) {
 		ArrayList<Category> result = new ArrayList<Category>();
		result.add(new Category(
				/*"stefan", 
				"djfk;ldsjfl;kdjaslk;fdajkl",
				"Stefan",
				"Nozinic", 
				null, 
				"+381555333", 
				null, 
				"admin@prodex.com"*/
			));
		return result.get(0);
		//return Response.status(200).entity(result.get(0)).build();
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Category createCategory(Category data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteCategory(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Category updateCategory(@PathParam("id") int id, Category data) 
	{
		return data;
	}
}