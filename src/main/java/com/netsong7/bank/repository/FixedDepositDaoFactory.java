package com.netsong7.bank.repository;

public class FixedDepositDaoFactory {
	private FixedDepositDaoFactory(){}
	
	public static FixedDepositDao getFixedDepositDao(String daoType){
		FixedDepositDao dao = null;
		
		if(daoType.equals("jdbc")){
			dao = new FixedDepositDaoJdbc();
		}
		else if(daoType.equals("mybatis")){
			dao = new FixedDepositDaoMabatis();
		}
		else if(daoType.equals("hibernate")){
			dao = new FixedDepositDaoHibernate();
		}
		
		return dao;
	}
}
