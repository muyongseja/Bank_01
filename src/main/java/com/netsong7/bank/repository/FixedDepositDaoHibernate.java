package com.netsong7.bank.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.netsong7.bank.App;
import com.netsong7.bank.domain.FixedDepositDetail;

public class FixedDepositDaoHibernate implements FixedDepositDao{
	static final Logger logger = LogManager.getLogger(App.class);
	private Map<Long, FixedDepositDetail> fixedDeposits = 
			new HashMap<Long, FixedDepositDetail>();
	
	public FixedDepositDaoHibernate(){
		logger.info("Hibernate방식의 DAO 클래스 사용");
	}
	
	public boolean createFixedDeposit(FixedDepositDetail fdd){
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
	
	public FixedDepositDetail getFixedDepositDetail(long id){
		return fixedDeposits.get(id);
	}
}
