package com.webclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webclientController {
	@GetMapping(value ="/getMsg")
	public String getMsg() {
		return "hi this is lokesh";
	}
	

}
