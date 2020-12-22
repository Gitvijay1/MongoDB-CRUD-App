package com.app.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerService;

@RestController
public class CustRestController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> savedata(@RequestBody Customer cust){
		String msg = service.saveCust(cust);
		return ResponseEntity.ok(msg+" save succcesgylly");
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> findData(){
		List<Customer> list = service.findAllData();
		return ResponseEntity.ok(list);
	}


}
