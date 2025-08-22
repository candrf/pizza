package com.example.pizza.service;

import com.example.pizza.model.Pizza;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PizzaService {

    private ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();

    public Pizza savePizza(Pizza pizza){
        pizzaList.add(pizza);
        return pizza;
    }

    public Pizza findPizza(Long id){
        for (Pizza pizza : pizzaList){
            if (id.equals(pizza.getId())){
                return pizza;
            }
        }
        return null;
    }
}
