package com.group.eams.controller;

import com.group.eams.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class WebController {

	@Autowired
	private IEmployeeService  employeeServiceImpl;

	@RequestMapping(value = {"", "/"})
	public String forwardView(){
		System.out.println("asdfasdfasdfsdf");
		return "login";
	}

	@RequestMapping("/login")
	public ModelAndView login(String account, String password){
		//创建视图数据模型
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("message", employeeServiceImpl.findEmployeeByAccount(account, password));
		modelView.setViewName("home");
		return modelView;
	}
}
