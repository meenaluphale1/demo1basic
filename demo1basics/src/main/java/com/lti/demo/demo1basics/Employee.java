package com.lti.demo.demo1basics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


public class Employee 
{
	@Value("Manohar Perikar")
	private String empName;	
	
	public String getEmpName() {
	return empName;
	}
	public void setEmpName(String empName) {
	this.empName = empName;
	}
	
	//Dependency Injection is a design pattern,
	//and @autowired is a mechanism for implementing it.
			
	@Autowired
	@Qualifier("address")
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}
	
	/*@Autowired
	private Address address1;
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address1=" + address1 + "]";
	}*/
}  