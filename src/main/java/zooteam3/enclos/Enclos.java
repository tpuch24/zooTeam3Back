package zooteam3.enclos;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
public class Enclos {
	@Id 
	@GeneratedValue
	private int id = 0;
	
	@Column
	private String nom;
	
	@Column
	private String type;
	
	@Column
	private int nbAnimal = 0;
	
	@Column
	private int nbAnimalMax = 0;

	public Enclos() {
	}

	public Enclos(String nom, int nbAnimal, int nbAnimalMax, String type) {
        this.nom = nom;
        this.nbAnimal = nbAnimal;
        this.nbAnimalMax = nbAnimalMax;
        this.type = type;
    }
    
	
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getNbAnimal() {
		return nbAnimal;
	}


	public void setNbAnimal(int nbAnimal) {
		this.nbAnimal = nbAnimal;
	}


	public int getNbAnimalMax() {
		return nbAnimalMax;
	}


	public void setNbAnimalMax(int nbAnimalMax) {
		this.nbAnimalMax = nbAnimalMax;
	}

}
