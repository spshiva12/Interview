package com.ojas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@RequestMapping("/hello")
	public String display(@RequestParam int sid, @RequestParam String sname, @RequestParam String add, Model M) {
		M.addAttribute("sid", sid);
		M.addAttribute("sname", sname);
		M.addAttribute("add", add);

		return "view.jsp";

	}

}
