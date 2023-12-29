package com.kubernetes.Kubernetes.Assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/home")
public class UserController {
	
	@GetMapping("/form")
	public String inputForm() {
		return "form";
	}
	
    @PostMapping("/submit")
    public String submitForm(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "result";
    }

}
