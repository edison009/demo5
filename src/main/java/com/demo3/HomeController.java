package com.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@RequestMapping("/demo/welcome")
	public String hello()
	{
		System.out.println("COmes Here from Git level 3 push");
		return "hello";
	}

}
