package com.stefan.prodex.storage;

import java.util.ArrayList;
import com.stefan.prodex.data.Comment;

public class CommentStorage 
{
	public Comment get(int id) 
	{
		return new Comment();
	}

	public ArrayList<Comment> list() 
	{
		return new ArrayList<Comment>();
	}

	public boolean create(Comment data) 
	{
		return true;
	}

	public boolean delete(int id) 
	{
		return true; 
	}
	public boolean update(int id,  Comment data) 
	{
		return true; 
	}
}