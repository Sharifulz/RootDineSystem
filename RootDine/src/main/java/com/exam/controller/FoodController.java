package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Food;
import com.exam.service.FoodService;

@RestController
public class FoodController {
	@Autowired
	FoodService productService;
	
	@GetMapping("/allProduct")
	public List<Food> allProduct(){
		return productService.getAllProduct();
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody Food product) {
		productService.saveProduct(product);
		return "Saved Product Successfull";
	}
	
}
