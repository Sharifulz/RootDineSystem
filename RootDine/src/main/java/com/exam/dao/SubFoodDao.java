package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.FoodSubCatagory;
@Repository
public interface SubFoodDao extends JpaRepository<FoodSubCatagory, Integer> {

}
