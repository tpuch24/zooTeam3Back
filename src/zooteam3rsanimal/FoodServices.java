/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.as.quickstarts.rsfood;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
//import javax.ejb.Stateful;
//import javax.ejb.Stateless;

/**
 * 
 *
 * @author jmdel
 *
 */
//@Stateless
//@Stateful
public class FoodServices implements FoodServiceInterface{

	private static ArrayList<Food> foodList = new ArrayList<>();
	/* No longer a singleton
    private FoodServices() {
        super();
        initList();
    }
    */
	

    @PostConstruct
	public void initList() {
		if(foodList.isEmpty()){		
			Food aFood = new Food("beef", "meat", "carnivorous", 100.0, "kg");
			foodList.add(aFood);
			aFood = new Food("mais", "grain", "birds", 50.0, "kg");
			foodList.add(aFood);
			aFood = new Food("salad", "vegetable", "turtle", 30.0, "kg");
			foodList.add(aFood);
			aFood = new Food("popkorn", "visito", "human", 80.0, "kg");
			foodList.add(aFood);
		}
	}
    
	@Override	
	public ArrayList<Food> getAll(){	
		return foodList;
	}
	
	@Override
	public  Food getByName(String name) {		
		for (Food food : foodList){
			if(food.getName().equals(name)){
				return food;
			}
		}
		return new Food("Food Not Found ","","",Double.valueOf("0"),"");
	}
	
	@Override
	public  boolean addFood(Food food){		
		return(foodList.add(food));
	}
	
	@Override
	public  boolean deleteFood(String name){	
		int i=0;
		for (Food food : foodList){
			if(food.getName().equals(name)){
				foodList.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}
	
	@Override
	public boolean updateFood(Food food){
		
		String name=food.getName();
		int i=0;
		for (Food pfood : foodList){
			if(pfood.getName().equals(name)){
				foodList.set(i,food);
				return true;
			}
			i++;
		}
		return false;
	}
	
}

	

