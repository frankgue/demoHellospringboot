package com.gkfcsolution.demohello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemohelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohelloApplication.class, args);
	}

	@RestController
	class Hello {

		@RequestMapping("/")
		String index() {
			return "Hello world";
		}
	}

}
