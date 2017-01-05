package com.netsong7.bank.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.netsong7.bank.App;
import com.netsong7.bank.domain.FixedDepositDetail;

public class FixedDepositDaoJdbc implements FixedDepositDao{
	static final Logger logger = LogManager.getLogger(FixedDepositDaoJdbc.class);
	
	private String url;
	private String driverClass;
	private String userName;
	private String password;
	
	private Map<Long, FixedDepositDetail> fixedDeposits = 
		new HashMap<Long, FixedDepositDetail>();
	
	public FixedDepositDaoJdbc(){
		logger.info("Jdbc방식의 DAO 클래스 사용");
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean createFixedDeposit(FixedDepositDetail fdd){
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
	
	public FixedDepositDetail getFixedDepositDetail(long id){
		return fixedDeposits.get(id);
	}
}






