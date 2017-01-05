package com.netsong7.bank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	static final Logger logger = LogManager.getLogger(LogTest.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:META-INF/applicationContext.xml");
		
		FixedDepositController controller =	ctx.getBean("controller", FixedDepositController.class);
		logger.info("정기예금 개설여부:" + controller.submit());
		logger.info("1번고객의 정기예금 정보:" +controller.get(1));
	}
}
