package com.netsong7.bank;

public class FixedDepositController {
	private FixedDepositService service = new FixedDepositService();
	
	public boolean submit(){
		FixedDepositDetail detail = 
			new FixedDepositDetail(1, 1000, 365, "aaa@aaa.net");
		return service.createFixedDeposit(detail);
	}
	
	public FixedDepositDetail get(long id){
		return service.getFixedDepositDetail(id);
	}
}
