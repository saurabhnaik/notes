package com.saurabh.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tyre tyre;//xml based config - mixed configuration
	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Meri gadi Daud Padi uski cakki");
	}

}
