package com.cheesey.pizzashopapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {
	
	@RequestMapping("/pizzas")
	public String getPizzas() {
		
		return "Pizza are good";
		
	}

}
