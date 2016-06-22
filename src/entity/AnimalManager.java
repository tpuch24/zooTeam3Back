package entity;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.ws.rs.core.GenericEntity;

/**
 * Created by Thierry on 06/06/2016.
 */

@Stateful
public class AnimalManager implements IAnimalManager{

    protected static ArrayList<Animal> liste = new ArrayList<Animal>();
    //protected static AnimalManager instance =null;

   // private AnimalManager(){
   //     super();
   //     initListe(); 
   //     }
    
    public AnimalManager()
    {
    	super();
    }

    //public static AnimalManager getInstance(){
    //    if (instance==null){
    //        instance = new AnimalManager();
    //    }
    //    return instance;
    //}

    @Override
    public ArrayList<Animal> getListe() {
		return liste;
	}

    @Override
    public void setListe(ArrayList<Animal> liste) {
		this.liste = liste;
	}
    
    //@Override
	//protected static void setInstance(AnimalManager instance) {
	//	AnimalManager.instance = instance;
	//}

    @PostConstruct
    @Override
	public void initListe(){
    	if (liste.isEmpty()) {
    		Animal animal = new Animal(3,"Tigre","Tigrou");
	        liste.add(animal);
	        animal = new Animal(2,"Ours","Balou");
	        liste.add(animal);
	        animal = new Animal(5,"Panthère","Baghera");
	        liste.add(animal);
	        animal = new Animal(4,"Serpent","Zaar");
	        liste.add(animal);
    	}
    }

    /**
     *
     * @return all animal's list
     */
    public ArrayList<Animal> getListeAnimal(){
        
        return liste;
    }

    /**
     *
     * @param name
     * @return  animal who have "name" - null if notexist
     */
    public Animal getAnimalByName(String name){
        for (Animal animal: liste  ) {
            if (animal.getName().compareTo(name) == 0) { return animal;}
        }
        return null;
    }

    /**
     * Add an animal in list - Birth or new arrival
     * @param animal
     */
    public void addNewAnimal(Animal animal){
        for (Animal animalExist: liste  ) {
            if (animalExist.getName().compareTo(animal.getName()) == 0) { return;}
        }
        liste.add(animal);
    }

    /**
     * remove animal from list
     * @param animal
     */
    public void removeAnimal(Animal animal){

        //Context context = getApplicationContext();

        for (Animal animalExist: liste  ) {
            if (animalExist.getName().compareTo(animal.getName()) == 0) {
                liste.remove(animalExist);
              return;
            }
        }
    }


    public void updateAnimal(Animal animal){
        for (Animal animalExist: liste  ) {
           if (animalExist.getName().compareTo(animal.getName()) == 0) {
              liste.set(liste.indexOf(animalExist), animal);
               return;
           }
        }
    }


}

