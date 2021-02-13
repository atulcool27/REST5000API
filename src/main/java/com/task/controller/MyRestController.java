package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.service.MyNumberService;


@RestController
public class MyRestController {
	
	static int i=1;
	
	@Autowired
	MyNumberService service;

	@RequestMapping("/")
	public String incrementService()
	{
		System.out.println(i++);
		return ""+service.incrementNumber(1);
	}

}
