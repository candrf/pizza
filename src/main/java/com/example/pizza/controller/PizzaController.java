package com.example.pizza.controller;

import com.example.pizza.model.Pizza;
import com.example.pizza.service.PizzaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping
    public ResponseEntity<List<Pizza>> getAllPizzas(){
        return new ResponseEntity<>(pizzaService.findAllPizza(), HttpStatus.I_AM_A_TEAPOT);
    }

}
