package com.niit.fairyworld.dao;

import java.util.List;

import com.niit.fairyworld.model.Category;


public interface CategoryDAO {
	

	
	public boolean save(Category category);
	
	
	
	public boolean update(Category category);
	
	
	public   Category     get(String id);
	
	
	//delete the category
	
	public   boolean    delete(String id);
	
	//to get all the categorys
	public List<Category>   list();
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
