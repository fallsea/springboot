package com.fallsea.springboot1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月22日 上午11:24:25
 */
@RestController
public class DemoController {

	
	@RequestMapping("/hello")
	public String hello() {
		return "hello fallsea";
	}
	
}
