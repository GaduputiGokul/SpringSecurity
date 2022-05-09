package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SuppressWarnings("unused")
public class HomeResource {
	@GetMapping()
	public String home() {
		return ("<h1>welcome<h1/>");
	}

}
