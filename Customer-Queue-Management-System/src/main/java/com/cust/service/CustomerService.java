package com.cust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.dao.CustomerDao;
import com.cust.home.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public Customer getCustomer(int customerId) {

		Customer customer = customerDao.getCustomer(customerId);
		return customer;
	}
}
