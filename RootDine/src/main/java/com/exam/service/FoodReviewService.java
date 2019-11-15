package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.exam.dao.FoodReviewDao;
import com.exam.dao.SubFoodDao;
import com.exam.model.FoodReview;
import com.exam.model.FoodSubCatagory;
@Service
public class FoodReviewService {
	@Autowired
	FoodReviewDao repo;
	
	public List<FoodReview> getAllfoodReview(){
		return repo.findAll();
	}
	public void savefoodReview(FoodReview foodReview) {
		repo.save(foodReview);
	}
}
