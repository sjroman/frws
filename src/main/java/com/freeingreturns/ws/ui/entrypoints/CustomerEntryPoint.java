package com.freeingreturns.ws.ui.entrypoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.BeanUtils;

import com.freeingreturns.ws.model.dto.Customer;
import com.freeingreturns.ws.model.requests.CreateCustomerRequest;
import com.freeingreturns.ws.model.requests.UpdateCustomerRequest;
import com.freeingreturns.ws.model.responses.CreateCustomerResponse;
import com.freeingreturns.ws.model.responses.DeleteCustomerResponse;
import com.freeingreturns.ws.model.responses.GetCustomerResponse;
import com.freeingreturns.ws.model.responses.UpdateCustomerResponse;
import com.freeingreturns.ws.service.CustomerService;
import com.freeingreturns.ws.service.CustomerServiceImpl;
import com.freeingreturns.ws.utils.errorhandling.ErrorCode;
import com.freeingreturns.ws.utils.errorhandling.FRBackEndException;
import com.freeingreturns.ws.utils.errorhandling.FRDatabaseException;
import com.freeingreturns.ws.utils.errorhandling.FRDuplicateEntityException;
import com.freeingreturns.ws.utils.errorhandling.FRInvalidInputException;
import com.freeingreturns.ws.utils.errorhandling.FRMalformedDTOException;
import com.freeingreturns.ws.utils.errorhandling.FRMissingRequiredFieldException;
import com.freeingreturns.ws.utils.errorhandling.FRNoResultsException;

@Path("/customers")
public class CustomerEntryPoint {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CreateCustomerResponse createCustomer(CreateCustomerRequest request) {
		CreateCustomerResponse response = new CreateCustomerResponse();

		try {
			Customer newCustomerDTO = new Customer();
			//copy data from request object to the customer DTO object
			BeanUtils.copyProperties(request, newCustomerDTO);
			
			//pass customer object to service layer
			CustomerService customerService = new CustomerServiceImpl();
			customerService.createCustomer(newCustomerDTO);
			
			//update response with correct values
			response.setID_CT(newCustomerDTO.getID_CT());
			response.setStatus(ErrorCode.NoError);
			response.setStatusDesc("Success");
		} catch (FRDatabaseException dbException) {
			response.setStatus(ErrorCode.DatabaseError);
			response.setStatusDesc("ERROR: " + dbException.getMessage());
			dbException.printStackTrace();
		} catch (FRMissingRequiredFieldException missingFieldExc) {
			response.setStatus(ErrorCode.MissingRequiredField);
			response.setStatusDesc("ERROR: " + missingFieldExc.getMessage());
			missingFieldExc.printStackTrace();
		} catch (FRMalformedDTOException malformedDtoError) {
			response.setStatus(ErrorCode.MalformedDTO);
			response.setStatusDesc("ERROR: " + malformedDtoError.getMessage());
			malformedDtoError.printStackTrace();
		} catch (FRBackEndException beExc) {
			response.setStatus(ErrorCode.BackEndError);
			response.setStatusDesc("ERROR: " + beExc.getMessage());
			beExc.printStackTrace();
		} catch (FRDuplicateEntityException dupExc) {
			response.setStatus(ErrorCode.DuplicateEntity);
			response.setStatusDesc("ERROR: " + dupExc.getMessage());
			dupExc.printStackTrace();
		} catch (Exception e) {
			response.setStatus(ErrorCode.JavaError);
			response.setStatusDesc("ERROR: " + e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public GetCustomerResponse getCustomer(@PathParam("id") String id) {
		GetCustomerResponse response = new GetCustomerResponse();
		
		try {
			CustomerServiceImpl custServ = new CustomerServiceImpl();
			Customer customer = custServ.getCustomerByCustomerId(id);
			
			if(customer == null){
				response.setStatus(ErrorCode.NoResults);
				response.setStatusDesc("ERROR: No results were found for customer with id " + id);
			}
			else {
				BeanUtils.copyProperties(customer, response);
				response.setStatus(ErrorCode.NoError);
				response.setStatusDesc("Success");
			}
		} catch (FRNoResultsException noResExc) {
			response.setStatus(ErrorCode.NoResults);
			response.setStatusDesc("ERROR: no results found for customer with id " + id);
			noResExc.printStackTrace();
		} catch (FRInvalidInputException invInputExc) {
			response.setStatus(ErrorCode.InvalidInput);
			response.setStatusDesc("ERROR: invalid input for customer search by id " + id);
			invInputExc.printStackTrace();
		} catch (FRDatabaseException dbExc) {
			response.setStatus(ErrorCode.DatabaseError);
			response.setStatusDesc("ERROR: error when querying database for customer with id " + id);
			dbExc.printStackTrace();
		} catch (Exception e) {
			response.setStatus(ErrorCode.JavaError);
			response.setStatusDesc("ERROR: " + e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UpdateCustomerResponse updateCustomer(@PathParam("id") String customerId, UpdateCustomerRequest request) {
		UpdateCustomerResponse response = new UpdateCustomerResponse();
		
		try {
			CustomerServiceImpl custServ = new CustomerServiceImpl();
			Customer customer = custServ.getCustomerByCustomerId(customerId);
			
			if(customer == null){
				response.setStatus(ErrorCode.NoResults);
				response.setStatusDesc("ERROR: No results were found for customer with id " + customerId);
			}
			else {
				//customer was found, now to update their values
				//verify that customer ID's match
				if(!customerId.equals(customer.getID_CT())) {
					response.setStatus(ErrorCode.BackEndError);
					response.setStatusDesc("ERROR: customer id mismatch");
				}
				BeanUtils.copyProperties(request, customer);
				//update customer field values
				custServ.updateCustomer(customer);
				
				response.setStatus(ErrorCode.NoError);
				response.setStatusDesc("Success");
				response.setID_CT(customer.getID_CT());
			}
		} catch (FRNoResultsException noResExc) {
			response.setStatus(ErrorCode.NoResults);
			response.setStatusDesc("ERROR: no results found for customer with id " + customerId);
			noResExc.printStackTrace();
		} catch (FRInvalidInputException invInputExc) {
			response.setStatus(ErrorCode.InvalidInput);
			response.setStatusDesc("ERROR: invalid input for customer update by id " + customerId);
			invInputExc.printStackTrace();
		} catch (FRDatabaseException dbExc) {
			response.setStatus(ErrorCode.DatabaseError);
			response.setStatusDesc("ERROR: error when querying database for customer with id " + customerId);
			dbExc.printStackTrace();
		} catch (FRMissingRequiredFieldException missingFieldExc) {
			response.setStatus(ErrorCode.MissingRequiredField);
			response.setStatusDesc("ERROR: " + missingFieldExc.getMessage());
			missingFieldExc.printStackTrace();
		} catch (FRMalformedDTOException malformedDtoError) {
			response.setStatus(ErrorCode.MalformedDTO);
			response.setStatusDesc("ERROR: " + malformedDtoError.getMessage());
			malformedDtoError.printStackTrace();
		} catch (FRBackEndException beExc) {
			response.setStatus(ErrorCode.BackEndError);
			response.setStatusDesc("ERROR: " + beExc.getMessage());
			beExc.printStackTrace();
		}  catch (Exception e) {
			response.setStatus(ErrorCode.JavaError);
			response.setStatusDesc("ERROR: " + e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public DeleteCustomerResponse deleteCustomer(@PathParam("id") String customerId) {
		DeleteCustomerResponse response = new DeleteCustomerResponse();
		
		try {
			CustomerServiceImpl custServ = new CustomerServiceImpl();
			Customer customer = custServ.getCustomerByCustomerId(customerId);
			
			if(customer == null){
				response.setStatus(ErrorCode.NoResults);
				response.setStatusDesc("ERROR: No results were found for customer with id " + customerId);
			}
			else {
				//delete the user since we now know they exist
				custServ.deleteCustomer(customerId);
				
				response.setStatus(ErrorCode.NoError);
				response.setStatusDesc("Success");
			}
		} catch (FRNoResultsException noResExc) {
		 	response.setStatus(ErrorCode.NoResults);
			response.setStatusDesc("ERROR: no results found for customer with id " + customerId);
			noResExc.printStackTrace();
		} catch (FRInvalidInputException invInputExc) {
			response.setStatus(ErrorCode.InvalidInput);
			response.setStatusDesc("ERROR: invalid input for customer delete by id " + customerId);
			invInputExc.printStackTrace();
		} catch (FRDatabaseException dbExc) {
			response.setStatus(ErrorCode.DatabaseError);
			response.setStatusDesc("ERROR: error when querying database for customer with id " + customerId);
			dbExc.printStackTrace();
		} catch (FRMissingRequiredFieldException missingFieldExc) {
			response.setStatus(ErrorCode.MissingRequiredField);
			response.setStatusDesc("ERROR: " + missingFieldExc.getMessage());
			missingFieldExc.printStackTrace();
		} catch (FRMalformedDTOException malformedDtoError) {
			response.setStatus(ErrorCode.MalformedDTO);
			response.setStatusDesc("ERROR: " + malformedDtoError.getMessage());
			malformedDtoError.printStackTrace();
		} catch (FRBackEndException beExc) {
			response.setStatus(ErrorCode.BackEndError);
			response.setStatusDesc("ERROR: " + beExc.getMessage());
			beExc.printStackTrace();
		}  catch (Exception e) {
			response.setStatus(ErrorCode.JavaError);
			response.setStatusDesc("ERROR: " + e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
}
