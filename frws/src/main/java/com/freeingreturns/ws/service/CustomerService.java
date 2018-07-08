package com.freeingreturns.ws.service;

import com.freeingreturns.ws.model.dto.Customer;
import com.freeingreturns.ws.utils.errorhandling.FRDatabaseException;
import com.freeingreturns.ws.utils.errorhandling.FRInvalidInputException;
import com.freeingreturns.ws.utils.errorhandling.FRNoResultsException;

public interface CustomerService {
	public void createCustomer(Customer customer) throws Exception;
	
	public Customer getCustomerByCustomerId(String customerId) throws FRInvalidInputException, FRNoResultsException, FRDatabaseException;
	
	public void updateCustomer(Customer customer) throws Exception;
	
	public void deleteCustomer(String customerId) throws Exception;
	
}
