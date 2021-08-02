package com.phoenix.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.phoenix.entities.User;
import com.phoenix.exceptions.UserNotFoundException;
import com.phoenix.services.UserService;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 2/08/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * Description:
 *    pojo class or request processor component
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/Login")
	//@RequestMapping(path = "/Login", method = RequestMethod.POST)
	public String validateUser(User user, ModelMap map, HttpSession session) {
		try {

			User dbUser = userService.findByUsername(user.getUsername());

			if (dbUser.getPassword().equals(user.getPassword())) {
				map.addAttribute("uname", user.getUsername());
				return "welcome.jsp";
			} else {
				map.addAttribute("logonerror", "Invalid username/password");
				session.setAttribute("logonerror", "Invalid username/password");
				//return "redirect:/login.jsp";
				return "redirect:/login-error";
			}
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("logonerror", e.getMessage());
			return "login.jsp";
		}
	}

	@GetMapping("/login-error")
	//@RequestMapping(path = "/login-error", method = RequestMethod.GET)
	public String loginError(ModelMap map) {
		return "login.jsp";
	}
	

}