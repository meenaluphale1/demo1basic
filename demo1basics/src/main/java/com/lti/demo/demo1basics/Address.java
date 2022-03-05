package com.lti.demo.demo1basics;

import org.springframework.beans.factory.annotation.Value;


public class Address {
	
	@Value("Mhapse")
	private String city;
	@Value("goa")
	private String state;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}
