package com.marketfrobes.springcloudtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHelloController {

	
	@RequestMapping("/display")
	
	public String displayMessage(@RequestParam("name") String name) {
		
		String message ="Hi "+ name + " .How are you today !";
		
		return message;
	}
	
}
