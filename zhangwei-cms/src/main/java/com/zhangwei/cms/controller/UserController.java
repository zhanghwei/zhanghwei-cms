package com.zhangwei.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
 
	@RequestMapping("")
	public String index() {
		return "index";
	}
}
