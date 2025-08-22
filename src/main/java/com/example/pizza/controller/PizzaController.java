package com.example.pizza.controller;

import com.example.pizza.model.Pizza;
import com.example.pizza.service.PizzaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/pizza")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService){
        this.pizzaService = pizzaService;
    }

    @PostMapping
    public Pizza createPizza(@RequestBody Pizza newPizza){
        return pizzaService.savePizza(newPizza);
    }

    @GetMapping("/{id}")
    public Pizza findPizza(@PathVariable Long id){
        return pizzaService.findPizza(id);
    }

}
