package org.jboss.as.quickstarts.rsfood;

import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.jboss.as.quickstarts.rsfood.Food;
import java.io.Serializable;

@Path("/food")
//@SessionScoped
public class FoodMethods{


	@GET
	@Path("/")
	public String getRoorTest() {
		return "Root test ok";
	};

	@Inject
	FoodServiceInterface foodService;

	@GET
	@Path("/getall")
	@Produces({ "application/json" })
	public ArrayList<Food> getAllJSON() {
		return foodService.getAll();
	};

	@GET
	@Path("/getbyname/{name}")
	@Produces({ "application/json" })
	public Food getByNameJSON(@PathParam("name") String name) {
		return foodService.getByName(name);
	};

	
	@POST
	@Path("/add")
	@Consumes({ "application/json" })
	public String addFood(Food food) {
		if (foodService.addFood(food)) {
			return "SUCCESS_ADD";
		}
		return "FAILURE_ADD";
	}
	
	@PUT
	@Path("/update")
	@Consumes({ "application/json" })
	public String updateFood(Food food) {
		if (foodService.updateFood(food)) {
			return "SUCCESS_UPDATE";
		}
		return "FAILURE_UPDATE";
	}

	@DELETE
	@Path("/del/{foodname}")

	public String deleteFood(@PathParam("foodname") String foodname) {
		if (foodService.deleteFood(foodname)) {
			return "SUCCESS_DELETE";
		}
		return "FAILURE_DELETE";
	}

}
