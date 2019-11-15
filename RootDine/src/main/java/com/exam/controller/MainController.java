package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Catagory;
import com.exam.service.CatagoryService;
import com.exam.service.DrinksService;
import com.exam.service.FoodReviewService;
import com.exam.service.FoodService;
import com.exam.service.SubFoodService;

@RestController
public class MainController {

	@Autowired
	CatagoryService serviceCatagory;
	
	@Autowired
	FoodService serviceFood;
	
	@Autowired
	SubFoodService serviceSubFood;
	
	@Autowired
	FoodReviewService serviceReview;
	
	@Autowired
	DrinksService serviceDrinks;
	@RequestMapping("/all")
	public List<Catagory> listMainApi(){
		LogTest.log.info("Return Value----- "+serviceCatagory.getAllCatagory());
		return serviceCatagory.getAllCatagory();
	}
}
