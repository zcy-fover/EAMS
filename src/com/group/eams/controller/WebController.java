package com.group.eams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {
	public String forwardView(){
		System.out.println("shuchu ceshi ");
		return "index";
	}
}
