package com.example.demo.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AddressDt;
import com.example.demo.model.AddressDto;
import com.example.demo.model.AddressResponse;
import com.example.demo.repository.AddressRepository;
import com.example.demo.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public AddressResponse getAddressDetails(int id) {
		
	//Not required simply		
	//	AddressDt addressDto = addressRepository.findById(id).get();
		
		AddressDto addressDto = addressRepository.findAddressByEmployeeId(id);	
		AddressResponse addressResponse = modelMapper.map(addressDto, AddressResponse.class);		
		return addressResponse;
	}

}
