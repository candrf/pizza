package com.example.pizza.service;

import com.example.pizza.model.Pizza;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService {

    private final ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();

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

    public List<Pizza> findAllPizza(){
        return pizzaList;
    }
}
