package com.saurabh.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Meri gadi Daud Padi");
	}

}
