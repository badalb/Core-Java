package com.test.singleresp;

import java.util.Date;

public class BPEmployee {
	private String employeeId;
	private String name;
	private String address;
	private Date dateOfJoining;

	public boolean isPromotionDueThisYear() {
		// promotion logic implementation
		return false;
	}

	public Double calcIncomeTaxForCurrentYear() {
		// income tax logic implementation
		return 0.0;
	}

	// Getters & Setters for all the private attributes
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}