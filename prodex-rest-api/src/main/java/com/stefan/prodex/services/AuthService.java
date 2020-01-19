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

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Date;

@Path("/Auth")
public class AuthService {
	
	@Context private HttpServletRequest request;
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public APIStatus login(Credentials credentials) 
	{
		UserStorage storage = new UserStorage();
		String hash = Hasher.getSHA(credentials.getPassword());
		String username = credentials.getUserName();
		for (User usr : storage.list()) 
		{
			if (usr.getUsername().equals(username)) 
			{
				if (usr.getPassword().equals(hash)) 
				{
					HttpSession session = request.getSession(true);
					session.setAttribute("user", usr);

					// login successful
					return new APIStatus(0, "OK");
				}
				else 
				{
					return new APIStatus(1, "Wrong password");
				}
			}
		}
		return new APIStatus(2, "User does not exist");
	}
	
	@GET
	@Produces("application/json")
	public APIStatus role() 
	{
		AuthManager manager = new AuthManager(request);
		User me = manager.getCurrentUser();
		if (me == null) return new APIStatus(0, "NOT_LOGGED");
		else if (manager.getCurrentBuyer() != null) return new APIStatus(1, "BUYER");
		else if (manager.getCurrentSeller() != null) return new APIStatus(2, "SELLER");
		else return new APIStatus(3, "ADMIN");
	}

}
