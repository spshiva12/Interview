package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiController {

	@RequestMapping("/h")
	public String sayHello() {
		return "hello.jsp";
	}
	
	@RequestMapping("/helloagain")
	public String display() {
		return "final.jsp";
	}

}
