package com.netsong7.bank.repository;

import com.netsong7.bank.domain.FixedDepositDetail;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetail fdd);
	FixedDepositDetail getFixedDepositDetail(long id);
}
