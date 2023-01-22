package com.example.viikkotehtava_viikko1.web;
//Ensimmäinen viikkotehtävä 
//Create Spring Boot application that handle requests to the endpoints /index and /contact. Index
//endpoint returns string ‘This is the main page’ and contact endpoint returns string ‘This is the contact
//page’.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	
	@RequestMapping("index")
	@ResponseBody
	public String returnIndex() {
		return "This is the main page";
	}

	@RequestMapping("contact")
	@ResponseBody
	public String returnContact() {
		return "This is the contact page";
	}
	//2. Request parameters
	//Create Spring Boot application that handle request to the endpoint /hello. Application gets two
	//parameters in the request. Parameter names are location and name. The application prints the following
	//text ‘Welcome to the (location value) (name value)!’
	
	@RequestMapping("hello")
	@ResponseBody
	public String Tervetuloa(@RequestParam(name="location", required=false, defaultValue="Korso") String location,
			@RequestParam(name="name", defaultValue ="Anis") String name) {
		return "Welcome to " + location + " " + name; 
	}
	
}
