package com.springlabcorrections.dao;

import java.util.List;

import com.springlabcorrections.domain.Customer;

public interface CustomerDAO {
	public List<Customer> findAll();
	public Customer findById(int id);
	public int save(Customer customer);
	public int delete(int id);

}
