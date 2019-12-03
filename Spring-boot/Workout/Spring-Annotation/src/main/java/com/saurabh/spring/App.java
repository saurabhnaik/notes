package com.saurabh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//using APPCONFIG to set configurations instead of xml
public class App {
	public static void main(String args[])
	{
		ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s1=factory.getBean(Samsung.class);
		s1.config();
	}
}
