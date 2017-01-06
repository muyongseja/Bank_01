package com.netsong7.bank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.netsong7.bank.controller.FixedDepositController;
import com.netsong7.bank.controller.IFixedDepositController;
import com.netsong7.bank.domain.FixedDepositDetail;
import com.netsong7.bank.service.IFixedDepositService;

public class App {
	static final Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:META-INF/applicationContext.xml");
		
		/*
		IFixedDepositController controller = ctx.getBean("controller", IFixedDepositController.class);
		logger.info("정기예금 개설여부:" + controller.submit());
		logger.info("1번고객의 정기예금 정보:" +controller.get(1));
		*/
		
		IFixedDepositService service = ctx.getBean("service", IFixedDepositService.class);
		service.createFixedDeposit(new FixedDepositDetail(1, 100, 100, "bbb@bbb.net"));
	}
}










