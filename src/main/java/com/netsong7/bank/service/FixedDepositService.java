package com.netsong7.bank.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Validator;

import com.netsong7.bank.App;
import com.netsong7.bank.domain.FixedDepositDetail;
import com.netsong7.bank.domain.FixedDepositValidator;
import com.netsong7.bank.repository.FixedDepositDao;

@Service("service")
public class FixedDepositService implements IFixedDepositService{
	static final Logger logger = LogManager.getLogger(App.class);
	
	private FixedDepositDao dao;
	@Autowired
	private FixedDepositValidator validator;
	
	@Autowired
	public void setDao(FixedDepositDao dao) {
		this.dao = dao;
	}
	
	public boolean createFixedDeposit(FixedDepositDetail fdd){
		BeanPropertyBindingResult bindingResult = 
			new BeanPropertyBindingResult(fdd, "Errors");
		
		validator.validate(fdd, bindingResult);
		
		if(bindingResult.getErrorCount() > 0){
			logger.info("계좌생성 에러");
			return false;
		}
		else{
			logger.info("계좌생성 성공");
			dao.createFixedDeposit(fdd);
			return true;
		}
	}
	
	public FixedDepositDetail getFixedDepositDetail(long id){
		return dao.getFixedDepositDetail(id);
	}
}
