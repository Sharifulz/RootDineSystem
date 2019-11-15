package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.DrinksAndDesert;
@Repository
public interface DrinksDao extends JpaRepository<DrinksAndDesert, Integer> {

}
