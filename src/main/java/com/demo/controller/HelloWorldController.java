package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	 @RequestMapping("/hello1")
	  public String hello1() {
	    return "Hello World";
	  }

	  @RequestMapping("/hello2")
	  public List<String> hello2() {
	    return Arrays.asList(new String[] { "A", "B", "C" });
	  }

}
