package zooteam3rsanimal;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.Body;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;


import entity.Animal;


@Path("animal")
public interface IAnimalRS {

	@GET
	@Path("animals")
	@Produces("application/json")
	public Response getListAnimal();

	@GET
	@Path("getbyname")
	@Produces("application/json")
	public Response getAnimalByName(@QueryParam("name") String name);
	
	@POST
	@Path("add")
	@Consumes("application/json")
	public void addNewAnimal(Animal animal);
	
	@DELETE
	@Path("remove")
	@Consumes("application/json")
	public void removeAnimal(Animal animal);
	
	@PUT
	@Path("update")
	@Consumes("application/json")
	public void updateAnimal(Animal animal, Animal animalupd);

}