package zooteam3;

import java.io.Serializable;
import java.util.ArrayList;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateless
public class EnclosEnDur implements IEnclosManager{
	
	public EnclosEnDur() {	}

	@Override
	public ArrayList<Enclos> getListeEnclos() {
		ArrayList<Enclos> listeEnclos = new ArrayList<Enclos>();
        Enclos enclos = new Enclos( "Enclos des lions", 3, 7, "Cage");
        enclos.setId(1);
        listeEnclos.add(enclos);
        enclos = new Enclos("Enclos des oiseaux", 8, 12, "Volière");
        enclos.setId(5);
        listeEnclos.add(enclos);
        enclos = new Enclos("Parc des reptiles", 40, 60, "Vivarium");
        enclos.setId(6);
        listeEnclos.add(enclos);
        enclos = new Enclos("Enclos nord", 0, 10, "Enclos");
        listeEnclos.add(enclos);
        enclos.setId(9);

        return listeEnclos;
	}
	
	@Override
	public Enclos getEnclos(int id) {
        Enclos enclos = new Enclos("Parc des reptiles", 40, 60, "Vivarium");
        enclos.setId(6);
        return enclos;
	}

	@Override
	public boolean deleteEnclos(int id) {
        return true;
	}
	
	@Override
	public Enclos insertEnclos(Enclos enclos) {
        Enclos enclo = new Enclos("Nouvel enclos", 40, 60, "Vivarium");
        enclos.setId(16);
        return enclo;
	}

	@Override
	public Enclos updateEnclos(Enclos enclos) {
        return enclos;
	}


}
