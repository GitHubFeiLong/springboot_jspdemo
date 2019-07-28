package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author msi
 * @Date 2019/7/28 14:50
 */
@Controller
public class Demo {

	@RequestMapping("/indexJsp")
	public String indexJsp(){
		System.out.println("进入控制器");
		return "indexJsp";
	}
}
