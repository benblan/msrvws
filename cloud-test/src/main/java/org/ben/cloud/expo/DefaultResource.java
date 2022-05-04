package org.ben.cloud.expo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultResource {

	public DefaultResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/")
	String getDefault() {
		return "Default";
	}

}
