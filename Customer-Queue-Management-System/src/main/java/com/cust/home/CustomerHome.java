package com.cust.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class CustomerHome {
	
	@GetMapping("/get/{custId}")
	public ModelAndView getCustomer(@PathVariable("custId") int cusId) {
			
		return null;
		
	}
}
