package com.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonalControler {
	
	@GetMapping(value = "/v1/person")
	public PersonOne getVersionOne() {
		return new PersonOne("Sarath Kumar");
	}
	
	@GetMapping(value = "/v2/person")
	public PersonTwo getVersionTwo() {
		return new PersonTwo(new Name("Sarath", "Kumar"));
	}
	
	@GetMapping(value = "/person", params="version=1")
	public PersonOne getVersionParam1() {
		return new PersonOne("Sarath Kumar");
	}
	
	@GetMapping(value = "person", params="version=2")
	public PersonTwo getVersionParam2() {
		return new PersonTwo(new Name("Sarath", "Kumar"));
	}
	
	@GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
	public PersonOne getVersionHeader1() {
		return new PersonOne("Sarath Kumar");
	}
	
	@GetMapping(value = "person/header", headers = "X-API-VERSION=2")
	public PersonTwo getVersionHeader2() {
		return new PersonTwo(new Name("Sarath", "Kumar"));
	}
	
	@GetMapping(value = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonOne getVersionAccept1() {
		return new PersonOne("Sarath Kumar");
	}
	
	@GetMapping(value = "person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonTwo getVersionAccept2() {
		return new PersonTwo(new Name("Sarath", "Kumar"));
	}
	
}
