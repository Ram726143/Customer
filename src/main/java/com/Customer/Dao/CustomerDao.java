package com.Customer.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Customer.Entity.Customer;
import com.Customer.Repository.CustomerRepository;




@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository er;
	public String postCus(Customer c) {
		er.save(c);
		return "Posted Successfully";
	}


}
