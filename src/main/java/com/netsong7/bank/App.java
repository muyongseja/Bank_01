package com.netsong7.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:META-INF/applicationContext.xml");
		
		FixedDepositController controller = 
			new FixedDepositController();
		System.out.println("정기예금 개설여부:" + controller.submit());
		System.out.println("1번고객의 정기예금 정보:" +controller.get(1));
	}
}
