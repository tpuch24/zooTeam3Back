package entity;

import java.util.ArrayList;

public interface IAnimalManager {

	    public void initListe();

	    public ArrayList<Animal> getListe();

	    public void setListe(ArrayList<Animal> liste);
	    
	    public Animal getAnimalByName(String name);

	    public void addNewAnimal(Animal animal);

	    public void removeAnimal(Animal animal);

	    public void updateAnimal(Animal animal);
	    
}