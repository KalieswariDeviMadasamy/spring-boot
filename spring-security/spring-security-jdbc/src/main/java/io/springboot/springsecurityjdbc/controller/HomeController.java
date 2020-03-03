package io.springboot.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return ("<h2>Welcome</h2>");
	}
	
	@RequestMapping("/user")
	public String user() {
		return ("<h2>Welcome User</h2>");
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return ("<h2>Welcome Admin</h2>");
	}

}
