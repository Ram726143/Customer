package com.Customer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Customer.Dao.CustomerDao;
import com.Customer.Entity.Customer;


@Service
public class CustomerService {
	@Autowired
	CustomerDao cd;
	public String postCus(@RequestBody Customer c) {
		return cd.postCus(c);
	}

}
