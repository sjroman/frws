package com.freeingreturns.ws.utils;

import java.util.Objects;

import com.freeingreturns.ws.model.dto.Customer;
import com.freeingreturns.ws.utils.errorhandling.FRMalformedDTOException;
import com.freeingreturns.ws.utils.errorhandling.FRMissingRequiredFieldException;

public class CustomerUtils {

	
	public static void validateCustomer(Customer customer) throws FRMalformedDTOException, FRMissingRequiredFieldException {
		if(customer == null) 
			throw new FRMissingRequiredFieldException("Null customer");
		if(customer.getID_CT() == null)
			throw new FRMissingRequiredFieldException("Null customer ID_CT");
		if(customer.getID_CT().isEmpty())
			throw new FRMalformedDTOException("Customer ID_CT is empty");
		if(customer.getID_PRTY() == null || customer.getID_PRTY() == 0)
			throw new FRMissingRequiredFieldException("Null customer ID_PRTY");
	}
	
	public static void assignDefaults(Customer customer) {
		if(customer.getSTS_CT() == null) 
			customer.setSTS_CT(0);
		if(customer.getID_CT_BTCH() == null)
			customer.setID_CT_BTCH(-1);
	}
}
