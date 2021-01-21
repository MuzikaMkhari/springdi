package com.springlabcorrections.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlabcorrections.domain.Customer;
import com.springlabcorrections.service.CustomerServiceImpl;


public class CustomerServiceTest {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		CustomerServiceImpl cs = ctx.getBean("customerServiceImpl",CustomerServiceImpl.class);
		List<Customer> customers = cs.getAll();
		for (Customer c : customers) {
			System.out.println(c);
		}
		ctx.close();
		ctx.registerShutdownHook();
		
	}

}
