package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.FoodReview;
@Repository
public interface FoodReviewDao extends JpaRepository<FoodReview, Integer> {

}
