package com.shashi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shashi.model.RegEmployee;
import com.shashi.service.RegService;

@Controller
public class RegistrationLoginController {

	@Autowired
	private RegService regservice;

	@RequestMapping("/")
	String home() {
		return "index";

	}

	@RequestMapping("/login")
	String login() {
		return "login";

	}

	@RequestMapping("/reg")
	String regstration() {
		return "reg";
	}

	@RequestMapping(value = "/registeEmp", method = RequestMethod.POST)
	String SaveRegstration(@ModelAttribute("user") RegEmployee regemployee) {
		regservice.save(regemployee);
		return "home";

	}

}