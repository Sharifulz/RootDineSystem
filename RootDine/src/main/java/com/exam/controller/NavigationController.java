package com.exam.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exam.service.CatagoryService;
import com.exam.service.FoodReviewService;
import com.exam.service.FoodService;
import com.exam.service.SubFoodService;

@Controller
public class NavigationController {
	@Autowired
	CatagoryService serviceCatagory;
	
	@Autowired
	FoodService serviceFood;
	
	@Autowired
	SubFoodService serviceSubFood;
	
	@Autowired
	FoodReviewService serviceReview;
	
	@RequestMapping("/hhhh")
	public String welcome(Map<String, Object> model) {
			LogTest.log.info("index Value----- "+serviceCatagory.getAllCatagory().size());
			return "index";
		}
	@RequestMapping("/")
	public ModelAndView sendHome() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("index.html");
			return mv;
	}
}

