package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String date;
	private String category;
	private int numberSold;
	private int income;

	public Ticket(int id, int income, String category, String date, int numberSold) {
		this.id = id;
		this.income = income;
		this.category = category;
		this.date = date;
		this.numberSold = numberSold;
	}

	public Ticket() {
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumberSold() {
		return numberSold;
	}

	public void setNumberSold(int numberSold) {
		this.numberSold = numberSold;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
