package com.rest.webservices.restful_web_services.filtering;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@Controller
public class CommonFilter {

	public MappingJacksonValue filterSomeValue(SomeBean someBean, String Type) {

		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
		
		SimpleBeanPropertyFilter filter;
		
		if (Type.equals("first")) {
			filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
		} else {
			filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
		}

		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

		mappingJacksonValue.setFilters(filters);

		return mappingJacksonValue;

	}

}
