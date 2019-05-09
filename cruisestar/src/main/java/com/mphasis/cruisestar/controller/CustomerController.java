package com.mphasis.cruisestar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.mphasis.cruisestar.services.CustomerServices;

@Controller
public class CustomerController {
	@Autowired
	CustomerServices customerServices;

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		boolean logincustomer = customerServices.loginServices(username, password);
		if (logincustomer) {
			mv.setViewName("");
			mv.addObject("welcome", username);
      
		} else {
			mv.setViewName("");
			mv.addObject("message", "invalid credentials");
		}
		return mv;

}
}