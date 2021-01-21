package com.springlabcorrections.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlabcorrections.dao.CustomerDAO;
import com.springlabcorrections.domain.Customer;


@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public List<Customer> getAll() {
		return customerDAO.findAll();
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

}
