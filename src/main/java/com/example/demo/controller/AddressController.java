package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AddressResponse;
import com.example.demo.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("/address/{id}")
	ResponseEntity<AddressResponse> getAddressDetails(@PathVariable("id") int id)
	{
		AddressResponse response = addressService.getAddressDetails(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
