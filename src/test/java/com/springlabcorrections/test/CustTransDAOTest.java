package com.springlabcorrections.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlabcorrections.dao.CustTransDAO;
public class CustTransDAOTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		CustTransDAO cdao = ctx.getBean("custTransDAO",CustTransDAO.class);
		cdao.save();
		ctx.close();
		ctx.registerShutdownHook();
	}
}
