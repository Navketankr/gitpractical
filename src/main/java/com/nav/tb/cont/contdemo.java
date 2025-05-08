package com.nav.tb.cont;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class contdemo {
	
	@GetMapping("/")
	public String hello() {
		return "hello world";
	}
	

}
