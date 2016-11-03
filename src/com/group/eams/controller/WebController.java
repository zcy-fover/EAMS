package com.group.eams.controller;

import com.group.eams.entity.Employee;
import com.group.eams.service.IEmployeeService;
import com.group.eams.service.IWebService;
import com.group.eams.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class WebController {

	@Autowired
	private IWebService webService;

	@RequestMapping(value = {"", "/"})
	public String forwardView(){
		System.out.println("asdfasdfasdfsdf");
		return "login";
	}

	@RequestMapping("/login")
	public ModelAndView login(Employee employee){
		//创建视图数据模型
		ModelAndView modelView = new ModelAndView();
		Result result = webService.getEmployee(employee);
		modelView.addObject("result", result);
		modelView.setViewName("home");
		return modelView;
	}
}
