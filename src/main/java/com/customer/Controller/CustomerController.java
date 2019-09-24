package com.customer.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Dto.customerDto;
import com.customer.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createArtist(@RequestBody customerDto customerDto) {
		customerService.createCustomer(customerDto);
	}


	@RequestMapping(value = "", method = RequestMethod.GET)
	public customerDto getArtistById(@RequestParam(value="id", required = true) Long customerId,
	@RequestParam(value = "name", required = false) String name) {
		System.out.println("name : " + name);
		return customerService.getCustomer(customerId);
	}

//	// http://localhost:8000/amazonmusic/artist/20/detail
//
//	@RequestMapping(value = "/20/detail", method = RequestMethod.GET)
//	public ArtistDto getArtistFromId(@PathVariable(value = "id") Long artistId,
//	@RequestHeader(value = "auth-token") String authToken) {
//		System.out.println("auth token : " + authToken);
//		return artistService.getArtist(artistId);
//	}

}
