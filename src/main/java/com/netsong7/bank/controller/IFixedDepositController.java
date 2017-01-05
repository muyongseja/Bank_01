package com.netsong7.bank.controller;

import com.netsong7.bank.domain.FixedDepositDetail;
import com.netsong7.bank.service.IFixedDepositService;

public interface IFixedDepositController {
	public void setService(IFixedDepositService service);
	public boolean submit();
	public FixedDepositDetail get(long id);
}
