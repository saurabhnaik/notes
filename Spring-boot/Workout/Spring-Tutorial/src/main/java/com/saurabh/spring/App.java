package com.saurabh.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory 
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml"); //is superset of beanfactory ,xml confifured here
		//context is responsible to give bean
		//Configuration possible in two ways
		//xml based-initially 
		//annotation based configuration xml needs to be updated 
		//Java Configuration
		Vehicle v1=(Vehicle)context.getBean("bike");//how to know that which vehicle this requires XML file
		v1.drive();// Bean can be changed through xml without recompilation + advantage of using SpringFramework
	}

}
