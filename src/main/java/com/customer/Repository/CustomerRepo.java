package com.customer.Repository;

import java.util.List;

import javax.persistence.UniqueConstraint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customer.Dto.customerDto;
import com.customer.Entity.CustomerEntity;

@Repository
@Transactional
public class CustomerRepo extends AbstractRepo {

	public void save(CustomerEntity customerEntity) {
		entityManager.persist(customerEntity);
	}

	public CustomerEntity getById(Long id) {
		
		CustomerEntity customer =  entityManager.find(CustomerEntity.class, id);
			
		return customer;
	}

}
