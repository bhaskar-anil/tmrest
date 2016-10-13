package com.bhaskar.tmrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class TmrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmrestApplication.class, args);
	}
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String welcome(){
		return "index";
	}
	
}
