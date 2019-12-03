package com.saurabh.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Worlds best processor");
	}

}
