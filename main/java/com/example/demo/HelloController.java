package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
   
	@RequestMapping("/hello.htm")
	public String hello() {
		return "hello";
	}
    
    @RequestMapping("/kalyan")
    @ResponseBody
    public String kal(){
        return "kal";
    }
}