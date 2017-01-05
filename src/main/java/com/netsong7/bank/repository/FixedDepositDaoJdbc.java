package com.netsong7.bank.repository;

import java.util.HashMap;
import java.util.Map;

import com.netsong7.bank.domain.FixedDepositDetail;

public class FixedDepositDaoJdbc implements FixedDepositDao{
	private String url;
	private String driverClass;
	private String userName;
	private String password;
	
	private Map<Long, FixedDepositDetail> fixedDeposits = 
		new HashMap<Long, FixedDepositDetail>();

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






