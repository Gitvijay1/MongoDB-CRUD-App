package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repo.CustomerMongoRepo;


@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerMongoRepo repo;

	@Override
	public String saveCust(Customer cust) {
          String id = repo.save(cust).getId();
		return id;
	}

	@Override
	public List<Customer> findAllData() {
          List<Customer> list = repo.findAll();
          
		return list;
	}
     
}
