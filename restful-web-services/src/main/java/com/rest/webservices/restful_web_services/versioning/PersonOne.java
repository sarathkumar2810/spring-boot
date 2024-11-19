package com.rest.webservices.restful_web_services.versioning;

public class PersonOne {
	
	private String name;

	public PersonOne(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonOne [name=" + name + "]";
	}
	
}
