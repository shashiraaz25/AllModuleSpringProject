package com.shashi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationLoginController {

	@RequestMapping("/")
	String home() {
		return "index";

	}

	@RequestMapping("login")
	String login() {
		return "login";

	}

	@RequestMapping("reg")
	String regstration() {
		return "reg";
	}
}