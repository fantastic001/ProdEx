package com.stefan.prodex.services;
import com.stefan.prodex.data.*;

public interface AuthListener<T> 
{
	T onBuyer(Buyer buyer, Object service); 
	T onSeller(Seller seller, Object service); 
	T onAdmin(Admin admin, Object service);
	T otherwise(Object service);
}
