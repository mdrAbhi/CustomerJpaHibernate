package com.customer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Dto.CLoginDto;
import com.customer.Dto.customerDto;
import com.customer.Repository.CLoginRepo;

@RestController
@RequestMapping(value = "/login")
public class CLoginController {

	@Autowired
	private CLoginRepo cRepo;
	
	@RequestMapping(value = "", method =  RequestMethod.GET)
	public CLoginDto login()
}
