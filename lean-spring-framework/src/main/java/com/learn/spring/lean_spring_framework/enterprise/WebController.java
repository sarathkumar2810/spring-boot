package com.learn.spring.lean_spring_framework.enterprise;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.spring.lean_spring_framework.business.BusinessService;

@Component
public class WebController {

//	@Autowired
	BusinessService businessService;

	public WebController(BusinessService businessService) {
		super();
		System.out.println("Constructor Injection");
		this.businessService = businessService;
	}

	public long returnValueFromBusiness() {
		return businessService.calculateSum();
	}

}
