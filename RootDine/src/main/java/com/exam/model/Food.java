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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ss_food")
public class Food {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_food;
	String foodName;
	@Column(columnDefinition = "integer default 0")
	private int foodPrice;
	@Column(name = "id_catagory")
	private Integer id_catagory;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_food", referencedColumnName = "id_food")
    private List<FoodSubCatagory> foodSubCatagory;

	public int getId_food() {
		return id_food;
	}

	public void setId_food(int id_food) {
		this.id_food = id_food;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Integer getId_catagory() {
		return id_catagory;
	}

	public void setId_catagory(Integer id_catagory) {
		this.id_catagory = id_catagory;
	}

	public List<FoodSubCatagory> getFoodSubCatagory() {
		return foodSubCatagory;
	}

	public void setFoodSubCatagory(List<FoodSubCatagory> foodSubCatagory) {
		this.foodSubCatagory = foodSubCatagory;
	}

	public Food(int id_food, String foodName, int foodPrice, Integer id_catagory,
			List<FoodSubCatagory> foodSubCatagory) {
		super();
		this.id_food = id_food;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.id_catagory = id_catagory;
		this.foodSubCatagory = foodSubCatagory;
	}

	public Food() {
		super();
	}

	
	
	//------------GETTER SETTER
	
	
	
}

