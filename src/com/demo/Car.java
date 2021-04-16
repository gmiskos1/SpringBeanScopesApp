package com.demo;

public class Car implements Vehicle {

	private TaxService taxService;
	
	public Car(TaxService taxService) {
		this.taxService = taxService;
	}
	
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "This is a car";
	}

}
