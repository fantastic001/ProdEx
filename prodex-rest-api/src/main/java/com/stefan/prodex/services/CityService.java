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
 
@Path("/City")
public class CityService {
 
	@GET
	@Produces("application/json")
	public ArrayList<City> listtCity() {
 
 		ArrayList<City> result = new ArrayList<City>();
		result.add(this.getCity(0));
		result.add(this.getCity(1));
		result.add(this.getCity(2));
		result.add(this.getCity(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public City getCity(@PathParam("id") int id) {
		City item = new City();
		item.setId(id);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public City createCity(City data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteCity(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public City updateCity(@PathParam("id") int id, City data) 
	{
		return data;
	}
}