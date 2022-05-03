package org.ben.cloud.expo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileResource {

	public FileResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello, world";
	}

}
