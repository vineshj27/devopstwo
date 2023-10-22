package com.devopstwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devopstwo {

	@GetMapping(path="/message")
public String getMessage() {
		return "Checking";
	}
	
	
}
