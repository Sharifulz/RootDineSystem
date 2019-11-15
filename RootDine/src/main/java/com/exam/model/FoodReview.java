package com.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ss_food_review")
public class FoodReview {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id_review;
	String review;
	@Column(name = "id_sub_food")
	private Integer id_sub_food;
	
	public int getId_review() {
		return id_review;
	}
	public void setId_review(int id_review) {
		this.id_review = id_review;
	}
	public String getTx_review() {
		return review;
	}
	public void setTx_review(String review) {
		this.review = review;
	}
	public Integer getId_sub_food() {
		return id_sub_food;
	}
	public void setId_sub_food(Integer id_sub_food) {
		this.id_sub_food = id_sub_food;
	}
	public FoodReview(int id_review, String review, Integer id_sub_food) {
		super();
		this.id_review = id_review;
		this.review = review;
		this.id_sub_food = id_sub_food;
	}
	public FoodReview() {
		super();
	}
	
}
