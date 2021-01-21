package com.springlabcorrections.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springlabcorrections.domain.Customer;


@Repository("customerDAO")
public class CustomerDAOImpl  implements CustomerDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
		public List<Customer> findAll() {
		String sql = "select * from customers";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
	}

	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int save(Customer customer) {
		
		String sql = "insert into customers(name,email) values (?,?)";
		Object params[] = {customer.getName(),customer.getEmail()};
		int n = jdbcTemplate.update(sql,params);
		return n;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
}
