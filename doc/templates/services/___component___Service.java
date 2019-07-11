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
 
@Path("/{{ component }}")
public class {{ component }}Service {
 
	@GET
	@Produces("application/json")
	public ArrayList<{{ component }}> listt{{ component }}() {
 
 		ArrayList<{{ component }}> result = new ArrayList<{{ component }}>();
		result.add(this.get{{ component}}(0));
		result.add(this.get{{ component}}(1));
		result.add(this.get{{ component}}(2));
		result.add(this.get{{ component}}(3));
		return result;
		//return Response.status(200).entity("{}").build();
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public {{ component }} get{{ component }}(@PathParam("id") int id) {
		{{ component }} item = new {{ component }}();
		item.setId(id);
		{% for field, type in fields.items() %}{% if type  not in ["String", "int", "boolean", "char", "float", "Date", "double"]%}item.set{{field[0].upper() + field[1:]}}(0);
		{% endif %}{% endfor %}
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public {{ component }} create{{ component }}({{ component }} data) 
	{
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response delete{{ component }}(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'deleted'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public {{ component }} update{{ component }}(@PathParam("id") int id, {{ component }} data) 
	{
		return data;
	}
}
