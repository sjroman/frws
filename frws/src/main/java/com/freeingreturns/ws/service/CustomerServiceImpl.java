package com.freeingreturns.ws.service;

import com.freeingreturns.ws.database.dao.DAO;
import com.freeingreturns.ws.database.dao.MySQLDAOImpl;
import com.freeingreturns.ws.model.dto.Customer;
import com.freeingreturns.ws.utils.CustomerUtils;
import com.freeingreturns.ws.utils.errorhandling.FRBackEndException;
import com.freeingreturns.ws.utils.errorhandling.FRDatabaseException;
import com.freeingreturns.ws.utils.errorhandling.FRDuplicateEntityException;
import com.freeingreturns.ws.utils.errorhandling.FRInvalidInputException;
import com.freeingreturns.ws.utils.errorhandling.FRNoResultsException;

public class CustomerServiceImpl implements CustomerService{

	DAO database;
	
	public CustomerServiceImpl() {
		this.database = new MySQLDAOImpl();
	}
	
	@Override
	public void createCustomer(Customer customer) throws Exception, FRBackEndException {
		Customer existingCustomer = null;
		try {
			//validate required fields
			CustomerUtils.validateCustomer(customer);
			
			//check if customer already exists
			existingCustomer = this.getCustomerByCustomerId(customer.getID_CT());
			if(existingCustomer != null) {
				//duplicate user cannot be created
				throw new FRDuplicateEntityException("Cannot create duplicate customer");
			}
			//only continue if there was not a previously existing user in the database
			//check for presence of values in fields that have a default value, if the value is null, assign default value
			CustomerUtils.assignDefaults(customer);
			
			//record this data in database
			this.saveCustomer(customer);
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Customer getCustomerByCustomerId(String customerId) throws FRInvalidInputException, FRNoResultsException, FRDatabaseException {
		Customer customer = null;
		
		if(customerId == null || customerId.isEmpty()) {
			throw new FRInvalidInputException("Customer ID is null");
		}
		
		try {
			this.database.openConnection();
			customer = this.database.getCustomerByCustomerId(customerId);
		} catch (FRDatabaseException dbExc) {
			throw dbExc;
		} catch (FRNoResultsException noResultsExc) {
			throw noResultsExc;
		} catch ( Exception e) {
			throw new FRDatabaseException("Error querying database for customer with id " + customerId + "\n" + e.getMessage());
		}
		finally {
			this.database.closeConnection();
		}
		
		return customer;
	}
	
	private void saveCustomer(Customer customer) {
		try {
			this.database.openConnection();
			this.database.saveCustomer(customer);
		} catch (FRDatabaseException dbExc) {
			throw dbExc;
		} catch ( Exception e) {
			throw new FRDatabaseException("Error saving customer with id " + customer.getID_CT() + " to database\n" + e.getMessage());
		}
		finally {
			this.database.closeConnection();
		}
	}
	
	private void udpateCustomerInDb(Customer customer) {
		try {
			this.database.openConnection();
			this.database.updateCustomer(customer);
		} catch (FRDatabaseException dbExc) {
			throw dbExc;
		} catch ( Exception e) {
			throw new FRDatabaseException("Error updating customer with id " + customer.getID_CT() + " to database\n" + e.getMessage());
		}
		finally {
			this.database.closeConnection();
		}
	}
	
	public void updateCustomer(Customer customer) throws Exception {
		Customer existingCustomer = null;
		try {
			//validate required fields
			CustomerUtils.validateCustomer(customer);
			
			//check if customer already exists
			existingCustomer = this.getCustomerByCustomerId(customer.getID_CT());
			if(existingCustomer == null) {
				//duplicate user cannot be created
				throw new FRDuplicateEntityException("Customer not found for customer id " + customer.getID_CT());
			}
			//only continue if there is a previously existing user in the database
			//check for presence of values in fields that have a default value, if the value is null, assign default value
			CustomerUtils.assignDefaults(customer);
			
			//record this data in database
			udpateCustomerInDb(customer);
			
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void deleteCustomer(String customerId) throws Exception {
		Customer customer = null;
		
		if(customerId == null || customerId.isEmpty()) {
			throw new FRInvalidInputException("Customer ID is null");
		}
		
		try {
			this.database.openConnection();
			customer = this.database.getCustomerByCustomerId(customerId);
			
			this.database.deleteCustomer(customer);
		} catch (FRDatabaseException dbExc) {
			throw dbExc;
		} catch (FRNoResultsException noResultsExc) {
			throw noResultsExc;
		} catch ( Exception e) {
			throw new FRDatabaseException("Error querying database for customer with id " + customerId + "\n" + e.getMessage());
		}
		finally {
			this.database.closeConnection();
		}
	}
	
}
