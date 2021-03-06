package com.nt.jai.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	@GetMapping("mydata")
	public String mydata(@RequestParam(value="sub",required = false ,defaultValue = "None")List<String>sub,Model model) {
		
		System.out.println("Sub=====>"+sub);
		model.addAttribute("sub", sub);
		
		return "mydata";
	}
	
	
	
	@GetMapping("/show")
	
	public String show(@RequestParam(value="sname",required=false)String sname,Model model) {
		
		System.out.println("name==>"+sname);
		model.addAttribute("sname", sname);
		
		
		return "employoee";
		
		
	}
}
