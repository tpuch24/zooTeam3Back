package zooteam3.enclos;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.inject.Inject;

import zooteam3.util.Dao;

@Stateless
public class EnclosManagerDao  implements IEnclosManager  {
	
	@Inject
	EnclosDao enclosDao;

	@Override
	public ArrayList<Enclos> getListeEnclos() {
		return (ArrayList<Enclos>)enclosDao.findAll();	
	}
	
	@Override
	public Enclos getEnclos(int id) {
		return enclosDao.findById(id);		
	}
	
	@Override
	public boolean deleteEnclos(int id) {
		Enclos enclos = enclosDao.findById(id);		
		enclosDao.remove(enclos);	
		return true;
	}

	@Override
	public Enclos insertEnclos(Enclos enclos) {
		enclosDao.persist(enclos);
		return enclos;
	}

	@Override
	public Enclos updateEnclos(Enclos enclos) {
		Enclos enclo = enclosDao.findById(enclos.getId());
//		enclo.setId(enclos.getId());
		enclo.setNbAnimal(enclos.getNbAnimal());
		enclo.setNbAnimalMax(enclos.getNbAnimalMax());
		enclo.setNom(enclos.getNom());
		enclo.setType(enclos.getType());
		enclosDao.persist(enclo);
		return enclo;
	}
}
