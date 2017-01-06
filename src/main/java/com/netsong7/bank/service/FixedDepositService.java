package com.netsong7.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.netsong7.bank.domain.FixedDepositDetail;
import com.netsong7.bank.repository.FixedDepositDao;

@Service("service")
public class FixedDepositService implements IFixedDepositService{
	private FixedDepositDao dao;
	
	@Autowired
	public void setDao(FixedDepositDao dao) {
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
