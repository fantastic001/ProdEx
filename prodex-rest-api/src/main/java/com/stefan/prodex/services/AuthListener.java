package com.stefan.prodex.services;
import com.stefan.prodex.data.*;

public interface AuthListener<T> 
{
	T onBuyer(Buyer buyer); 
	T onSeller(Seller seller); 
	T onAdmin(Admin admin);
	T otherwise();
}
