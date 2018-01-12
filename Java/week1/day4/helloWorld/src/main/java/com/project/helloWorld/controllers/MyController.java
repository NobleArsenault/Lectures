package com.project.helloWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController{
	@RequestMapping("/")
	public String index(){
		System.out.println("WE HIT ROOT!!");
		return "index";
	}
}