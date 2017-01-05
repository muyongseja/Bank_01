package com.netsong7.bank.repository;

import java.util.HashMap;
import java.util.Map;

import com.netsong7.bank.domain.FixedDepositDetail;

public class FixedDepositDaoHibernate implements FixedDepositDao{
	private Map<Long, FixedDepositDetail> fixedDeposits = 
			new HashMap<Long, FixedDepositDetail>();
	
	public boolean createFixedDeposit(FixedDepositDetail fdd){
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
	
	public FixedDepositDetail getFixedDepositDetail(long id){
		return fixedDeposits.get(id);
	}
}
