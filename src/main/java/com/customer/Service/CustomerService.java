package com.customer.Service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.Dto.customerDto;
import com.customer.Entity.CLoginEntity;
import com.customer.Entity.CustomerEntity;
import com.customer.Repository.CLoginRepo;
import com.customer.Repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private CLoginRepo cRepo;

//	@Autowired
//	private ArtistEntity artistEntity;

	public void createCustomer(customerDto customerDto) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setName(customerDto.getName());
		//customerEntity.setUsername(customerDto.getUsername());
		//customerEntity.setPassword(customerDto.getPassword());
		customerEntity.setEmail(customerDto.getEmail());
		customerEntity.setPhone(customerDto.getPhone());
		customerEntity.setAddress(customerDto.getAddress());
		customerEntity.setCreatedAt(customerDto.getCreatedAt());
				
		
		CLoginEntity cEntity = new CLoginEntity();
		cEntity.setUsername(customerDto.getUsername());
		cEntity.setPassword(customerDto.getPassword());
		cEntity.setCustomerEntity(customerEntity);
		
		
		
		cRepo.save(cEntity);
	}

	public customerDto getCustomer(Long id) {
		customerDto customerDto = new customerDto();
		CustomerEntity customerEntity = (CustomerEntity) customerRepo.getById(id);
		customerDto.setName(customerEntity.getName());
		//customerDto.setUsername(customerEntity.getUsername());
		//customerDto.setPassword(customerEntity.getPassword());
		customerDto.setEmail(customerEntity.getEmail());
		customerDto.setPhone(customerEntity.getPhone());
		customerDto.setAddress(customerEntity.getAddress());
		customerDto.setCreatedAt(customerEntity.getCreatedAt());
		// System.out.println(artistDto.toString());
		return customerDto;

	}

	public CustomerRepo getArtistRepo() {
		return customerRepo;
	}

	public void setArtistRepo(CustomerRepo artistRepo) {
		this.customerRepo = artistRepo;
	}
}
