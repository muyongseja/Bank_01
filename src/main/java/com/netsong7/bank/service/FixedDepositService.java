package com.netsong7.bank.service;

import com.netsong7.bank.domain.FixedDepositDetail;
import com.netsong7.bank.repository.FixedDepositDaoJdbc;

public class FixedDepositService {
	private FixedDepositDaoJdbc dao;
	
	public void setDao(FixedDepositDaoJdbc dao) {
		this.dao = dao;
	}

	public boolean createFixedDeposit(FixedDepositDetail fdd){
		dao.createFixedDeposit(fdd);
		return true;
	}
	
	public FixedDepositDetail getFixedDepositDetail(long id){
		return dao.getFixedDepositDetail(id);
	}
}
