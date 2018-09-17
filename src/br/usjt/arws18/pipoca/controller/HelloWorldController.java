package br.usjt.arws18.pipoca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String execute() {
		System.out.println("Controller foi chamado !");
		return "hello";
		
	}
	
}
