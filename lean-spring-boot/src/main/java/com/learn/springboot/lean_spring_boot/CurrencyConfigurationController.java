package com.learn.springboot.lean_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;

	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration getCurrency() {
		return configuration;
	}

}
