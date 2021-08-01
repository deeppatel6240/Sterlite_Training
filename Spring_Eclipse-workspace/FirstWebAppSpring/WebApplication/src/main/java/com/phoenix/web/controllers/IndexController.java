package com.phoenix.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index1() {
		System.out.println("Welcome to my web app");
		
		return "index.jsp";
	}
}
