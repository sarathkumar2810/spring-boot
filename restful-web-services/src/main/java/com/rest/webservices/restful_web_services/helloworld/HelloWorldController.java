package com.rest.webservices.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
//	@RequestMapping(method = RequestMethod.GET, path="/message")
	@GetMapping(path= "/message")
	public String GetMessage() {
		return "Hello World";
	}
	
	@GetMapping(path= "/message-bean")
	public HelloWorldBean GetHelloMessage() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path = "/message/{name}")
	public HelloWorldBean GetPathMessage(@PathVariable String name) {
		return new HelloWorldBean("Hello World, " + name);
	}
	
//	-Example: `en` - English ("Good Morning")
//	-Example: `nl` - Dutch ("Goedemorgen")
//	-Example: `fr` - French ("Bonjour")
//	-Example: `de` - Deutsch ("Guten Morgen")
	
	@GetMapping(path= "/message-internal")
	public String GetMessageInternational() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale );
	}

}
