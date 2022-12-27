package com.valmiki.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureAppApplication {


	@GetMapping("/message")
	public String getMessage(){
		return "Congrats! your app deployed successfully in Azure !";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureAppApplication.class, args);
	}

}
