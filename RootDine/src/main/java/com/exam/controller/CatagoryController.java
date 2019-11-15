package com.exam.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Catagory;
import com.exam.model.Food;
import com.exam.service.CatagoryService;
import com.exam.service.FoodService;
@RestController
@CrossOrigin(origins = "http://rms.rootdine.com:3210")
public class CatagoryController {
	@Autowired
	CatagoryService catagoryService;
	
	
	@GetMapping("/allCatagory")
	public List<Catagory> allProduct(){
		return catagoryService.getAllCatagory();
	}
}
