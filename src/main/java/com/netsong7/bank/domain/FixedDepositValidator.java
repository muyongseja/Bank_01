package com.netsong7.bank.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FixedDepositValidator implements Validator{
	public boolean supports(Class<?> arg0) {
		return FixedDepositDetail.class.isAssignableFrom(arg0);
	}

	public void validate(Object arg0, Errors arg1) {
		
	}
}
