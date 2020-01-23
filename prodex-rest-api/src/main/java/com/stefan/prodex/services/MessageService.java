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
 
 	private final MessageStorage storage = new MessageStorage();
	@GET
	@Produces("application/json")
	public ArrayList<Message> listtMessage() {
 
		MessageStorage messageStorage = new MessageStorage();
		HttpSession session = request.getSession(true);
		AuthManager<ArrayList<Message>> auth = new AuthManager<ArrayList<Message>>(request);
		User current = auth.getCurrentUser();
		if (current == null) return null;

		Buyer currentBuyer = auth.getCurrentBuyer();
		Seller currentSeller = auth.getCurrentSeller();
		ArrayList<Message> messages = messageStorage.list();
		ArrayList<Message> result = new ArrayList<>();
		if (currentBuyer != null) 
		{
			// buyer is found, getting messages which buyer sent
			for (Message message : messages) 
			{
				if (message.getBuyer() == currentBuyer.getId()) result.add(message);
			}
		}
		else if (currentSeller != null) 
		{
			// maybe current user is seller, in that case, give all messages in seller's inbox
			ArrayList<Item> items = (new SellerService()).listSellerItems(currentSeller.getId());
			for (Message message : messages) 
			{
				boolean found = false; 
				for (Item item : items) if (message.getItem() == item.getId()) found = true;
				if (found) result.add(message);
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
		AuthManager<Conversation> auth = new AuthManager<>(request);
		User current = auth.getCurrentUser();
		if (current == null) 
		{
			return null; // user not logged in
		}

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
		AuthManager<Message> auth = new AuthManager<>(request);
		User current = auth.getCurrentUser();
		if (current == null) return null;
		// check if current user is buyer because only buyers can send initial messages 
		Buyer buyer = auth.getCurrentBuyer();
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
		if(storage.update(id, data)) return data;
		else return null;
	}
}
