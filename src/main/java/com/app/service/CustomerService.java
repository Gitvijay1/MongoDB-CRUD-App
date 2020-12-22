package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface CustomerService {
	public String saveCust(Customer cust);
	public List<Customer> findAllData();
	

}
