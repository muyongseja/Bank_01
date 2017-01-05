package com.netsong7.bank;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogTest {
	static Logger log1 = Logger.getLogger(LogTest.class);
	static final org.apache.logging.log4j.Logger log2 = 
			LogManager.getLogger(LogTest.class);
	
	public static void main(String[] args) {
		System.out.println("test");
		log1.info("info메시지 입니다.");
		log1.error("error메시지 입니다.");
		log1.debug("debug메시지 입니다.");
		
		log2.info("log4j2로 만든 info메시지");
		log2.debug("log4j2로 만든 debug메시지");
		log2.error("log4j2로 만든 error메시지");
	}
}




