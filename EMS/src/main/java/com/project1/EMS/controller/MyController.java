package com.project1.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project1.EMS.entity.Employee;
import com.project1.EMS.service.EmpService;

@Controller
public class MyController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/home")
	public String home(Model m) {
		List<Employee> emp = service.getAllEmp();
		m.addAttribute("emp", emp);
		return "index";
	}
	
	@GetMapping("/addEmp")
	public String addEmpForm() {
		return "addEmp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e) {
		System.out.print(e);
		service.addEmp(e);
		return "redirect:/home";
	}

}
