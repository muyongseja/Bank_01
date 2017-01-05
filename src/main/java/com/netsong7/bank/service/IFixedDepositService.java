package com.netsong7.bank.service;

import com.netsong7.bank.domain.FixedDepositDetail;
import com.netsong7.bank.repository.FixedDepositDao;

public interface IFixedDepositService {
	public void setDao(FixedDepositDao dao);
	public boolean createFixedDeposit(FixedDepositDetail fdd);
	public FixedDepositDetail getFixedDepositDetail(long id);
}
