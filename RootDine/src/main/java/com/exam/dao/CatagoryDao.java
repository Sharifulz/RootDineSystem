package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.exam.model.Catagory;
@Repository
public interface CatagoryDao extends JpaRepository<Catagory, Integer> {

}
