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
 
@Path("/ItemReport")
public class ItemReportService {
 
	@GET
	@Produces("application/json")
	public ArrayList<ItemReport> listtItemReport() {
 
 		ArrayList<ItemReport> result = new ArrayList<ItemReport>();
		result.add(this.getItemReport(0));
		result.add(this.getItemReport(1));
		result.add(this.getItemReport(2));
		result.add(this.getItemReport(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public ItemReport getItemReport(@PathParam("id") int id) {
		ItemReport item = new ItemReport();
		item.setId(id);
		item.setItem(0);
		item.setBuyer(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public ItemReport createItemReport(ItemReport data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteItemReport(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public ItemReport updateItemReport(@PathParam("id") int id, ItemReport data) 
	{
		return data;
	}
}