package com.netsong7.bank.controller;

import com.netsong7.bank.domain.FixedDepositDetail;
import com.netsong7.bank.service.IFixedDepositService;

public class FixedDepositController implements IFixedDepositController{
	private IFixedDepositService service;
	
	public void setService(IFixedDepositService service) {
		this.service = service;
	}

	public boolean submit(){
		FixedDepositDetail detail = 
			new FixedDepositDetail(1, 1000, 365, "aaa@aaa.net");
		return service.createFixedDeposit(detail);
	}
	
	public FixedDepositDetail get(long id){
		return service.getFixedDepositDetail(id);
	}
}
