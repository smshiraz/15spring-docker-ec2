package com.syed.springdockerec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/getdata")
	public String getData()
	{
		return "Hi From MainController";
	}
}
