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

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Date;

@Path("/User")
public class UserService {
 
	@GET
	@Produces("application/json")
	public ArrayList<User> listtUser() {
 
		ArrayList<User> result = new ArrayList<User>();
		result.add(this.getUser(0));
		result.add(this.getUser(1));
		result.add(this.getUser(2));
		result.add(this.getUser(3));
		return result;
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
		data.setPassword(this.getSHA(data.getPassword()));
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

	public String getSHA(String input)
	{

		try {

            // Static getInstance method is called with hashing SHA
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // digest() method called
            // to calculate message digest of an input
            // and return array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown"
                               + " for incorrect algorithm: " + e);

            return null;
        }
    }
}
