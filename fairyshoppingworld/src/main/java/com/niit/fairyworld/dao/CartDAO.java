package com.niit.fairyworld.dao;

import java.util.List;

import com.niit.fairyworld.model.Cart;



public interface CartDAO {
	

	
	public boolean save(Cart cart);
public boolean update(Cart cart);
	
public boolean update(String emailID);
	
	
	public   Cart     get(String id);
	
	public   boolean    delete(String id);
	public List<Cart>   list(String emailID);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
