package com.app.model;

import org.springframework.data.annotation.Id;

import lombok.Data;


@Data
public class Customer{
	@Id
	private String id;
	private String cname;
	private String addr;
	private Integer age;

}
