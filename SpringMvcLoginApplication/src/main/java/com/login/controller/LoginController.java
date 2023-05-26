package com.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/validate")
	public String display(HttpServletRequest req, Model M) {

		String username = req.getParameter("name");
		String password = req.getParameter("password");

		if (username.equals("shiva") && password.equals("admin")) {
			String message = "Hello" + username;
			M.addAttribute("message", message);
			return "view.jsp";
		} else {
			String msg = "Sorry " + username + " your credentials is wrong: ";
			M.addAttribute("message", msg);
			return "errorpage.jsp";
		}

	}

}
