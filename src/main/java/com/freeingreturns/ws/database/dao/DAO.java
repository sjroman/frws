package com.freeingreturns.ws.database.dao;

import com.freeingreturns.ws.model.dto.Customer;
import com.freeingreturns.ws.utils.errorhandling.FRDatabaseException;
import com.freeingreturns.ws.utils.errorhandling.FRNoResultsException;

public interface DAO {
	public void openConnection();
	
	public void closeConnection();
	
	public Customer getCustomerByCustomerId(String customerId) throws FRDatabaseException, FRNoResultsException;
	
	public void saveCustomer(Customer customer) throws FRDatabaseException;
	
	public void updateCustomer(Customer customer) throws FRDatabaseException;
	
	public void deleteCustomer(Customer customer) throws FRDatabaseException;
}
