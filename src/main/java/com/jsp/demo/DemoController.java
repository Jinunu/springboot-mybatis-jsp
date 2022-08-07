package com.jsp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@RequestMapping("/")
	public String index() {
		int a = 3;
		System.out.println();

		String http = "zsd";
		System.out.println("index 진입");
		return "welcome";


	
	}

}
