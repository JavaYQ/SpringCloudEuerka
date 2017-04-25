package com.yq.springcloud.euerkaMinus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yq.springcloud.euerkaMinus.service.MinusService;

@RestController
public class TestController {
	protected static Logger logger=LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	MinusService minusService;
	
	@RequestMapping("/")
	public String helloworld(){
		logger.debug("访问helloworld");
		return "hello by YAN";
	}
	
	@RequestMapping("/service/api/{first},{second}")
	public int add(@PathVariable int first,@PathVariable int second){
		Integer result;
		result=minusService.getResult(first, second);
		logger.debug("访问add，result="+result);
		System.out.println("result="+result);
		return result;
	}
}
