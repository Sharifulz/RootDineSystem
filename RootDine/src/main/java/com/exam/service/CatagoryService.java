package com.exam.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exam.dao.CatagoryDao;
import com.exam.model.Catagory;
@Service
public class CatagoryService{

	@Autowired
	CatagoryDao repo;
	
	public List<Catagory> getAllCatagory(){
		return repo.findAll();
	}
	
}
