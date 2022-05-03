package org.ben.cloud.expo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileResource {

	public FileResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(value = {"/hello", "/hello/{name}"})
	public String getHello(@PathVariable(name = "name", required = false) String name) {
		if(StringUtils.isNotBlank(name)) {
			return "Hello, " + name;
		} else {
			return "Hello, world";
		}
	}

}
