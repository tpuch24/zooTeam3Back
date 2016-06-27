package zooteam3.enclos;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class DebutProg {
	
	@Inject
	EnclosDao enclosDao;
	
	@PostConstruct
	public void init() {
		
		Enclos dc = new Enclos();
		dc.setNom("Parc des reptiles");
		dc.setType("Vivarium");
		dc.setNbAnimal(3);
		dc.setNbAnimalMax(5);
		enclosDao.persist(dc);

		Enclos dc1 = new Enclos();
		dc1.setNom("Les oiseaux");
		dc1.setType("Volière");
		dc1.setNbAnimal(30);
		dc1.setNbAnimalMax(50);
		enclosDao.persist(dc1);
		
		Enclos dc2 = new Enclos();
		dc2.setNom("Grand pré");
		dc2.setType("Parc ruminants");
		dc2.setNbAnimal(15);
		dc2.setNbAnimalMax(15);
		enclosDao.persist(dc2);
		
		Enclos dc3 = new Enclos();
		dc3.setNom("Grand pré sud");
		dc3.setType("Parc ruminants");
		dc3.setNbAnimal(10);
		dc3.setNbAnimalMax(20);
		enclosDao.persist(dc3);
		
//		ArrayList<Encos> dcs = new ArrayList<Enclos>(); 
//		dcs = (ArrayList<Enclos>) EnclosDao.findAll();
//		System.out.println("dcs size "+ dcs.size());
		
	}

}
