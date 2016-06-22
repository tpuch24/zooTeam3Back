package org.jboss.as.quickstarts.rsfood;

public class Food {
private String name;
private String type;
private String eater;
private Double stock;
private String unity;

// Paramless Constructor to use JSON serializator
public Food(){};

public Food(String name, String type, String eater, Double stock, String unity) {
	super();
	this.name = name;
	this.type = type;
	this.eater = eater;
	this.stock = stock;
	this.unity = unity;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getEater() {
	return eater;
}
public void setEater(String eater) {
	this.eater = eater;
}
public Double getStock() {
	return stock;
}
public void setStock(Double stock) {
	this.stock = stock;
}
public String getUnity() {
	return unity;
}
public void setUnity(String unity) {
	this.unity = unity;
}


}

