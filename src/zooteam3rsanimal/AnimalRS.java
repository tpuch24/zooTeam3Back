package zooteam3rsanimal;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.MessageBodyWriter;

import entity.Animal;
import entity.AnimalManager;
import entity.IAnimalManager;

public class AnimalRS implements IAnimalRS {

	@Inject
	IAnimalManager manager;
	

	@Override
	public Response getListAnimal() {
		//ArrayList<Animal> listAnimal = AnimalManager.getInstance().getListeAnimal();
		
		ArrayList<Animal> listAnimal = manager.getListe();
		GenericEntity<List<Animal>> result = new GenericEntity<List<Animal>>(listAnimal) {
        };
		
		return Response.ok(result).build();
	}

	@Override
	public Response getAnimalByName(String name) {
		
		Animal animal = manager.getAnimalByName(name); 
		GenericEntity<Animal> result = new GenericEntity<Animal>(animal) {
        };
		return Response.ok(result).build();
	}

	@Override
	public void addNewAnimal(Animal animal) {
		manager.addNewAnimal(animal);
	}

	@Override
	public void removeAnimal(Animal animal) {
		manager.removeAnimal(animal);
	}

	@Override
	public void updateAnimal(Animal animal, Animal animalupd) {
		manager.updateAnimal(animal);
	}
	
	
}