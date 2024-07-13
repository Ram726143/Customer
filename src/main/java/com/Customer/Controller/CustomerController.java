package com.Customer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Customer.Entity.Customer;
import com.Customer.Service.CustomerService;



@RestController
public class CustomerController {
	@Autowired
	CustomerService cs;
	@PostMapping (value="/PostCus")
	public String postCus(@RequestBody Customer c) {
		return cs.postCus(c);
	}
	

}
