package com.rajan.app;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Demo {
	@RequestMapping("/")
	public String say()
	{
		return "Show";
	}

	
	

}
