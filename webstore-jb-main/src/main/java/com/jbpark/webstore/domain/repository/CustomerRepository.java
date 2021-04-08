package com.jbpark.webstore.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.jbpark.webstore.domain.Customer;

public interface CustomerRepository {
	List<Customer> getAllCustomers();
	void addCustomer(Customer customer) throws DataAccessException;

}
