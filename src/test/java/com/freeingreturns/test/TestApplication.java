package com.freeingreturns.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.freeingreturns.ws.model.dto.Customer;
import com.freeingreturns.ws.model.requests.CreateCustomerRequest;
import com.freeingreturns.ws.service.CustomerService;
import com.freeingreturns.ws.service.CustomerServiceImpl;
import com.freeingreturns.ws.ui.entrypoints.CustomerEntryPoint;
import com.freeingreturns.ws.utils.errorhandling.FRDatabaseException;
import com.freeingreturns.ws.utils.errorhandling.FRInvalidInputException;
import com.freeingreturns.ws.utils.errorhandling.FRNoResultsException;


public class TestApplication {
	
	CustomerService customerService;
	
	@Before
	public void before() {
		customerService = new CustomerServiceImpl();
	}
	
	@Test
	public void testCreateCustomer() throws Exception {
		Customer c = new Customer();
		c.setID_CT("1");
		customerService.createCustomer(c);
	}
	
	@Test
	public void testGetCustomerByCustomerId() throws FRDatabaseException, FRInvalidInputException, FRNoResultsException {
		customerService.getCustomerByCustomerId("1");
	}
	
	@Test
	public void testCustomerEntryPoint() {
		CustomerEntryPoint ep = new CustomerEntryPoint();
		CreateCustomerRequest req = new CreateCustomerRequest();
		ep.createCustomer(req);
	}
}
