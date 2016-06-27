package zooteam3.enclos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.ejb.Stateless;


public interface IEnclosManager extends Serializable{
	
	public ArrayList<Enclos> getListeEnclos();
	
	public Enclos getEnclos(int id);
	
	public boolean deleteEnclos(int id);

	public Enclos insertEnclos(Enclos enclos);

	public Enclos updateEnclos(Enclos enclos);
}
