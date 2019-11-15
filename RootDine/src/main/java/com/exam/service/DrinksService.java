package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.DrinksDao;
import com.exam.dao.FoodReviewDao;
import com.exam.model.DrinksAndDesert;
import com.exam.model.FoodReview;

@Service
public class DrinksService {
	@Autowired
	DrinksDao repo;
	
	public List<DrinksAndDesert> getAllDrinks(){
		return repo.findAll();
	}
	public void saveDrinks(DrinksAndDesert drinksAndDesert) {
		repo.save(drinksAndDesert);
	}
}