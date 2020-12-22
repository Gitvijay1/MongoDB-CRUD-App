package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Customer;

public interface CustomerMongoRepo extends MongoRepository<Customer, String>{

  

	
}
