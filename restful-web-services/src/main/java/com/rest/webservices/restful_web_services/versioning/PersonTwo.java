package com.rest.webservices.restful_web_services.versioning;

public class PersonTwo {
	
	private Name name;
	
	public PersonTwo(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonTwo [name=" + name + "]";
	}

}
