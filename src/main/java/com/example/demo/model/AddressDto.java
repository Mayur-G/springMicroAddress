package com.example.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//we have added foreign key (employee_id) of Employee in addressDto in DB
@Entity
@Table(name="addressdto")
public class AddressDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="lane1")
	private String lane1;
	
	@Column(name="lane2")
	private String lane2;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zip;

	public AddressDto() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLane1() {
		return lane1;
	}

	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}

	public String getLane2() {
		return lane2;
	}

	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	
	
}
