package com.springlabcorrections.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springlabcorrections.domain.Customer;


@Repository("custTransDAO")
public class CustTransDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public int save() {
		Customer c1 = new Customer();
		c1.setName("Tom");
		c1.setEmail("tom@gmail.com");

		Customer c2 = new Customer();
		c2.setName("JerryOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		c2.setEmail("jerry@gmail.com");

		String sql1 = "insert into customers(name,email) values(?,?)";
		String sql2 = "insert into customers(name,email) values(?,?)";

		Object params1[] = { c1.getName(), c1.getEmail() };
		jdbcTemplate.update(sql1, params1);

		Object params2[] = { c2.getName(), c2.getEmail() };
		jdbcTemplate.update(sql2, params2);

		return 1;

	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
