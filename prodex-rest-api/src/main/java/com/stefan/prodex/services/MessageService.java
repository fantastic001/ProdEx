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
 
@Path("/Message")
public class MessageService {
	@Context private HttpServletRequest request;
 
	@GET
	@Produces("application/json")
	public ArrayList<Message> listtMessage() {
 
		MessageStorage messageStorage = new MessageStorage();
		HttpSession session = request.getSession(true);
		if (session.getAttribute("user") == null) 
		{
			return null; // user not logged in
		}
		User current = (User) session.getAttribute("user");

		// find buyer with id of current user
		int buyerId = -1; 
		Buyer currentBuyer = null;
		BuyerService buyerService = new BuyerService();
		for (Buyer buyer : buyerService.listBuyer()) 
		{
			if (buyer.getUser() == current.getId()) 
			{
				buyerId = buyer.getId();
				currentBuyer = buyer;
			}
		}
		ArrayList<Message> messages = messageStorage.list();
		ArrayList<Message> result = new ArrayList<>();
		if (buyerId != -1) 
		{
			// buyer is found, getting messages which buyer sent
			for (Message message : messages) 
			{
				if (message.getBuyer() == buyerId) result.add(message);
			}
		}
		else 
		{
			// maybe current user is seller, in that case, give all messages in seller's inbox
			Seller seller = (new SellerService()).findSellerByUserId(current.getId());
			if (seller != null) {
				ArrayList<Item> items = (new SellerService()).listSellerItems(seller.getId());
				for (Message message : messages) 
				{
					boolean found = false; 
					for (Item item : items) if (message.getItem() == item.getId()) found = true;
					if (found) result.add(message);
	
				}
			}
		}
		return result;
	}
	@Path("{id}/reply")
	@GET
	@Produces("application/json")
	public ArrayList<Conversation> getMessageReply(@PathParam("id") int id) {
		ConversationService conversationService = new ConversationService();
		ArrayList<Conversation> conversations = conversationService.listConversation();
		ArrayList<Conversation> result = new ArrayList<Conversation>();
		for (Conversation conversation : conversations) if (conversation.getInitialMessage() == id) result.add(conversation);
		return result;
	}
	
	@Path("{id}/reply")
	@POST
	@Produces("application/json")
	public Conversation getMessageReply(@PathParam("id") int id, Conversation conversation) {
		conversation.setInitialMessage(id);
		HttpSession session = request.getSession(true);
		if (session.getAttribute("user") == null) 
		{
			return null; // user not logged in
		}
		User current = (User) session.getAttribute("user");
		conversation.setUser(current.getId());
		return (new ConversationService().createConversation(conversation));
	}
 
	@Path("{id}")
	@GET
	@Produces("application/json")
	public Message getMessage(@PathParam("id") int id) {
		Message item = new Message();
		item.setId(id);
		item.setItem(0);
		item.setBuyer(0);
		
		return item;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Message createMessage(Message data) 
	{
		HttpSession session = request.getSession(true);
		if (session.getAttribute("user") == null) 
		{
			return null; // user not logged in
		}
		User current = (User) session.getAttribute("user");
		// check if current user is buyer because only buyers can send initial messages 
		Buyer buyer = (new BuyerService()).findBuyerByUserId(current.getId());
		if (buyer == null) return null;
		MessageStorage messageStorage = new MessageStorage(); 
		data.setBuyer(buyer.getId());
		messageStorage.create(data);
		return data;
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response deleteMessage(@PathParam("id") int id) 
	{
		return Response.status(200).entity("{'status': 'not available'}").build();
	}
	
	@Path("{id}")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Message updateMessage(@PathParam("id") int id, Message data) 
	{
		return null;
	}
}
