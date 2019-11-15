package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.Food;

@Repository
public interface FoodDao extends JpaRepository<Food, Integer>{

}
