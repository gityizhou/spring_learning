package com.zhouyi2019.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller继承于 @Component, 也会被scan到

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
