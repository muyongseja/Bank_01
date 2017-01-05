package com.netsong7.bank.controller;

import com.netsong7.bank.domain.FixedDepositDetail;
import com.netsong7.bank.service.FixedDepositService;

public class FixedDepositController {
	private FixedDepositService service;
	
	public void setService(FixedDepositService service) {
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
