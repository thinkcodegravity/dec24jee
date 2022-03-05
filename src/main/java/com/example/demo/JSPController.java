package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
	// http://ipaddress:port/success
	//http://ipaddress:port/<prefix><return><suffix>
	//http://ipaddress:port/jsp/welcome.jsp
	
	@RequestMapping("/success")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/add2Cart")
	public String addCart() {
		return "AddingInCart";
	}
	
//customer types : http://ip:port/add2Cart
//send customer : http://ip:port/jsp/AddingInCart.jsp

// Prefix + return result + suffix
// /jsp/welcome.jsp
}
