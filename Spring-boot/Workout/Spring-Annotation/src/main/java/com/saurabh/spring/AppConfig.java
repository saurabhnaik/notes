package com.saurabh.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//configuratiion class
@Configuration
@ComponentScan(basePackages = "com.saurabh.spring")
public class AppConfig {
//	@Bean
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcesor()
//	{
//		return new SnapDragon();
//	}
	
	/*without bean also possible
	 * need to mention compnent scan then
	 *  */
}
