package com.contenedor.peopledocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("endpoint")
public class PeopleController {

	@RequestMapping("/statuspeople")
	public String getStatus () {
		
		return "OKA....";
	}
}
