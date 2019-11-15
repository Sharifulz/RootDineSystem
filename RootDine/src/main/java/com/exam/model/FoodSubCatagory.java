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
@Table(name="ss_food_sub_catagory")
public class FoodSubCatagory {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_sub_food;
	private String subFoodDesc;
	private String subFoodImages;
	@Column(columnDefinition = "integer default 0")
	private int subFoodPrice;
	@Column(name = "id_food")
	private Integer id_food;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_sub_food", referencedColumnName = "id_sub_food")
    private List<FoodReview> foodReview;

	public int getId_sub_food() {
		return id_sub_food;
	}

	public void setId_sub_food(int id_sub_food) {
		this.id_sub_food = id_sub_food;
	}

	public String getSubFoodDesc() {
		return subFoodDesc;
	}

	public void setSubFoodDesc(String subFoodDesc) {
		this.subFoodDesc = subFoodDesc;
	}

	public String getSubFoodImages() {
		return subFoodImages;
	}

	public void setSubFoodImages(String subFoodImages) {
		this.subFoodImages = subFoodImages;
	}

	public int getSubFoodPrice() {
		return subFoodPrice;
	}

	public void setSubFoodPrice(int subFoodPrice) {
		this.subFoodPrice = subFoodPrice;
	}

	public Integer getId_food() {
		return id_food;
	}

	public void setId_food(Integer id_food) {
		this.id_food = id_food;
	}

	public List<FoodReview> getFoodReview() {
		return foodReview;
	}

	public void setFoodReview(List<FoodReview> foodReview) {
		this.foodReview = foodReview;
	}

	public FoodSubCatagory(int id_sub_food, String subFoodDesc, String subFoodImages, int subFoodPrice, Integer id_food,
			List<FoodReview> foodReview) {
		super();
		this.id_sub_food = id_sub_food;
		this.subFoodDesc = subFoodDesc;
		this.subFoodImages = subFoodImages;
		this.subFoodPrice = subFoodPrice;
		this.id_food = id_food;
		this.foodReview = foodReview;
	}

	public FoodSubCatagory() {
		super();
	}

	
	
}

