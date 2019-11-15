package com.exam.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="ss_catagory")
public class Catagory {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id_catagory;
	String catagoryName;
	String catagoryImage;
	String catagoryDesc;
	@Column(columnDefinition = "integer default 1")
	int is_catagory_available;
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_catagory", referencedColumnName = "id_catagory")
    private List<Food> food;
	public int getId_catagory() {
		return id_catagory;
	}
	public void setId_catagory(int id_catagory) {
		this.id_catagory = id_catagory;
	}
	public String getCatagoryName() {
		return catagoryName;
	}
	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}
	public String getCatagoryImage() {
		return catagoryImage;
	}
	public void setCatagoryImage(String catagoryImage) {
		this.catagoryImage = catagoryImage;
	}
	public String getCatagoryDesc() {
		return catagoryDesc;
	}
	public void setCatagoryDesc(String catagoryDesc) {
		this.catagoryDesc = catagoryDesc;
	}
	public int getIs_catagory_available() {
		return is_catagory_available;
	}
	public void setIs_catagory_available(int is_catagory_available) {
		this.is_catagory_available = is_catagory_available;
	}
	public List<Food> getFood() {
		return food;
	}
	public void setFood(List<Food> food) {
		this.food = food;
	}
	public Catagory(int id_catagory, String catagoryName, String catagoryImage, String catagoryDesc,
			int is_catagory_available, List<Food> food) {
		super();
		this.id_catagory = id_catagory;
		this.catagoryName = catagoryName;
		this.catagoryImage = catagoryImage;
		this.catagoryDesc = catagoryDesc;
		this.is_catagory_available = is_catagory_available;
		this.food = food;
	}
	public Catagory() {
		super();
	}
	
	
}
