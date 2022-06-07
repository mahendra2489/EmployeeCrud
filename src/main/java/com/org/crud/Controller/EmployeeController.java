package com.org.crud.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@RequestMapping("/")
	public String index() {
		return "Welcome to Employee Portal";
	}

}
