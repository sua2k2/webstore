package com.sua.webstore.domain.repository;

import java.util.List;

import com.sua.webstore.domain.Customer;

public interface CustomerRepository {
	List<Customer> getAllCustomers();
}
