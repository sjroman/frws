package com.freeingreturns.ws.database.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;

import com.freeingreturns.ws.database.entity.CustomerEntity;
import com.freeingreturns.ws.model.dto.Customer;
import com.freeingreturns.ws.utils.HibernateUtils;
import com.freeingreturns.ws.utils.errorhandling.FRDatabaseException;
import com.freeingreturns.ws.utils.errorhandling.FRNoResultsException;

public class MySQLDAOImpl implements DAO {
	
	Session session = null;

	@Override
	public void openConnection() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		session = sessionFactory.openSession();
	}

	@Override
	public void closeConnection() {
		if(session != null && session.isOpen()) {
			session.close();
		}
	}

	@Override
	public Customer getCustomerByCustomerId(String customerId) throws FRNoResultsException, FRDatabaseException {
		Customer customer = null;
		
		try {
			CriteriaBuilder cb = session.getCriteriaBuilder();
			//create criteria builder for particular persistence class
			CriteriaQuery<CustomerEntity> criteria = cb.createQuery(CustomerEntity.class);
			
			//query roots always reference entity
			Root<CustomerEntity> customerRoot = criteria.from(CustomerEntity.class);
			criteria.select(customerRoot);
			criteria.where(cb.equal(customerRoot.get("ID_CT"), customerId));
			
			//fetch single result
			Query<CustomerEntity> query = session.createQuery(criteria);
			List<CustomerEntity> resultsList = query.getResultList();
			if(resultsList != null && resultsList.size() > 0) {
				CustomerEntity customerEntity = resultsList.get(0);
				customer = new Customer();
				BeanUtils.copyProperties(customerEntity, customer);
			} else
				return null;
		} catch (Exception e) {
			throw new FRDatabaseException("Error querying database for customer with id " + customerId + "\n" + e.getMessage());
		}
		
		return customer;
	}

	@Override
	public void saveCustomer(Customer customer) throws FRDatabaseException {
		try {
			CustomerEntity customerEntity = new CustomerEntity();
			BeanUtils.copyProperties(customer, customerEntity);

			session.clear();
			session.beginTransaction();
			session.save(customerEntity);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			throw new FRDatabaseException(e.getMessage());
		}
	}
	
	@Override
	public void updateCustomer(Customer customer) throws FRDatabaseException {
		try {
			CustomerEntity customerEntity = new CustomerEntity();
			BeanUtils.copyProperties(customer, customerEntity);
		
			session.clear();
			session.beginTransaction();
			session.update(customerEntity);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			throw new FRDatabaseException(e.getMessage());
		}
	}

	@Override
	public void deleteCustomer(Customer customer) throws FRDatabaseException {
		try {
			CustomerEntity customerEntity = new CustomerEntity();
			BeanUtils.copyProperties(customer, customerEntity);
			
			session.clear();
			session.beginTransaction();
			session.delete(customerEntity);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			throw new FRDatabaseException(e.getMessage());
		}
	}

}
