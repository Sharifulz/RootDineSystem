package com.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ss_drinks")
public class DrinksAndDesert {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id_drinks;
	String drinksName;
	String drinksImage;
	@Column(columnDefinition = "integer default 0")
	int drinksPrice;
	public int getId_drinks() {
		return id_drinks;
	}
	public void setId_drinks(int id_drinks) {
		this.id_drinks = id_drinks;
	}
	public String getDrinksName() {
		return drinksName;
	}
	public void setDrinksName(String drinksName) {
		this.drinksName = drinksName;
	}
	public String getDrinksImage() {
		return drinksImage;
	}
	public void setDrinksImage(String drinksImage) {
		this.drinksImage = drinksImage;
	}
	public int getDrinksPrice() {
		return drinksPrice;
	}
	public void setDrinksPrice(int drinksPrice) {
		this.drinksPrice = drinksPrice;
	}
	public DrinksAndDesert(int id_drinks, String drinksName, String drinksImage, int drinksPrice) {
		super();
		this.id_drinks = id_drinks;
		this.drinksName = drinksName;
		this.drinksImage = drinksImage;
		this.drinksPrice = drinksPrice;
	}
	public DrinksAndDesert() {
		super();
	}
	
}
