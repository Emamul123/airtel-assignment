package com.cust.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cust.helper.SessionFactoryHelper;
import com.cust.home.Customer;

@Repository
public class CustomerDao {
	private SessionFactory sessionFactory;
	private Session session;

	public Customer getCustomer(int customerId) {
		sessionFactory = SessionFactoryHelper.getSessionFactory();
		session = sessionFactory.openSession();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		return customer;
	}
}
