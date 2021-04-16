package com.demo;

public class SportCar implements Vehicle {

	private TaxService taxService;
	
	public SportCar(TaxService taxService) {
		this.taxService = taxService;
	}
	
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "this is a sport car";
	}

}
