package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.exam.dao.FoodDao;
import com.exam.dao.SubFoodDao;
import com.exam.model.Food;
import com.exam.model.FoodSubCatagory;
@Service
public class SubFoodService {
	@Autowired
	SubFoodDao repo;
	
	public List<FoodSubCatagory> getAllSubCatagory(){
		return repo.findAll();
	}
	public void saveSubCatagory(FoodSubCatagory foodSubCatagory) {
		repo.save(foodSubCatagory);
	}
}
