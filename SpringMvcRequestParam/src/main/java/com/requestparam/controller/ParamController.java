package com.requestparam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.requestparam.beans.Student;

@Controller
public class ParamController {

//	@RequestMapping("hello/")
//	public static String display(@RequestParam("uname") String uname, @RequestParam("password") String password,
//			Model model) {
//		String message = "";
//
//		if (uname.equals("shiva") && password.equals("shiva@12")) {
//			message = "valid message";
//
//		} else {
//			message = "invalid credentials";
//
//		}
//		model.addAttribute("message", message);
//		return "index.jsp";
//
//	}

	@RequestMapping("/")
	public String getForm() {
		
		return "insert.jsp";
	}
	
	
	@RequestMapping("view")
	public static String studentDetails(@ModelAttribute Student student) {
		System.out.println(student.getSid());
		return "view.jsp";
	}

}
