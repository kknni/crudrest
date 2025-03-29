package com.belval.crudrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ecoController {
	@GetMapping ("eco")
	public String eco() {
		return "eco";
		
	}

}
