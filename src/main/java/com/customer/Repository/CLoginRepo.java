package com.customer.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customer.Entity.CLoginEntity;
import com.customer.Entity.CustomerEntity;


@Repository
@Transactional
public class CLoginRepo extends AbstractRepo{

	public void save(CLoginEntity loginEntity) {
		entityManager.persist(loginEntity);
		
	}

}
