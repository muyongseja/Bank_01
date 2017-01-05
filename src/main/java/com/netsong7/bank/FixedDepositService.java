package com.netsong7.bank;

public class FixedDepositService {
	private FixedDepositDao dao;
	
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
