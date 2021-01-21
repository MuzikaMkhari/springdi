package com.springlabcorrections.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlabcorrections.dao.CustomerDAO;
import com.springlabcorrections.domain.Customer;


public class CustomerDAOTest {
	
	public static void main(String[] args) {
		
	findTest();
	//	Customer c = new Customer();
	//	c.setName("Catharina");
	//	c.setEmail("cath@gmail.com");
	
	//	saveTest(c);
		
	}

	
	private static void saveTest(Customer c) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		CustomerDAO  customerDAO= ctx.getBean("customerDAO",CustomerDAO.class);
		int n = customerDAO.save(c);
		System.out.println(n + " record(s) saved...");
		ctx.close();
		ctx.registerShutdownHook();
	}


	private static void findTest() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		CustomerDAO  customerDAO= ctx.getBean("customerDAO",CustomerDAO.class);
		List<Customer> customers = customerDAO.findAll();
		for (Customer c : customers) {
			System.out.println(c);
		}
		ctx.close();
		ctx.registerShutdownHook();
	}

}
