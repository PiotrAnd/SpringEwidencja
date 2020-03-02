package com.ewidencja.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private Integer employeeId;
	
	@Column(name = "first_name")
	@NotNull
	private String firstName;
	
	@Column(name = "last_name")
	@NotNull
	private String lastName;
	
	@Column(name = "phone_number")
	@NotNull
	private int phoneNumber;

	public Employee() {
	}


	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "" + employeeId;
	}
}
