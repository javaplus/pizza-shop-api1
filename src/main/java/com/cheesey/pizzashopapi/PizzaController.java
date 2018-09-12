package com.cheesey.pizzashopapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cheesey.pizzashopapi.entities.Pizza;

@RestController
public class PizzaController {
	
	@RequestMapping("/pizzas")
	public List<Pizza> getPizzas() {
		
		// hard coded for now
		Pizza pizza =  new Pizza();
		pizza.setCheese("LOTS");
		pizza.setCrust("thin");
		pizza.setId(1);
		pizza.setSize("Large");
		
		List<Pizza> pizzaList = new ArrayList<>();
		pizzaList.add(pizza);
		
		return pizzaList;
		
	}
	
	

}
