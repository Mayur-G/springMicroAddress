package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddressDt;
import com.example.demo.model.AddressDto;

@Repository
public interface AddressRepository extends JpaRepository<AddressDto, Integer>{

	@Query(nativeQuery = true , value = "SELECT ae.id , ae.lane1 , ae.lane2 , ae.state , ae.zip FROM student.addressdto ae join student.employee ee on ee.id = ae.employee_id where ae.employee_id =:employeeId")
	AddressDto findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
