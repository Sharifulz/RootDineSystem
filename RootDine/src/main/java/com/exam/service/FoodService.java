package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.FoodDao;
import com.exam.model.Food;

@Service
public class FoodService {
	@Autowired
	FoodDao repo;
	
	public List<Food> getAllProduct(){
		return repo.findAll();
	}
	public void saveProduct(Food product) {
		repo.save(product);
	}
}
