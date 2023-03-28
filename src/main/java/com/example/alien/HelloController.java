package com.example.alien;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
//	@Autowired
//	Planet planet;
//	
	
	
	@Autowired
	 private BeanFactory beanFactory;
	
	@RequestMapping("/{planet}")
	public String  index(@PathVariable String planet) {
		
		Planet report = 
		         beanFactory.getBean(Planet.class, planet);
		
		return "greetings from "+report.getGreetings();
	}
	
	

}
