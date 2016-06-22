package org.jboss.as.quickstarts.rsfood;
import java.util.ArrayList;

public interface FoodServiceInterface {
	
	
	public ArrayList<Food> getAll();
	public Food getByName(String name);
	public boolean addFood(Food food);
	public boolean deleteFood(String name);
	public boolean updateFood(Food food);
	

}
