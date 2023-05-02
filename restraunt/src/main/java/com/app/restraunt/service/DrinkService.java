package com.app.restraunt.service;

import com.app.restraunt.exception.ResourceNotFoundException;
import com.app.restraunt.model.Drink;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DrinkService {
    private List<Drink> drinks = new ArrayList<>();

    public DrinkService() {
        // initialize some drinks
        drinks.add(new Drink("Espresso", 2.50, Arrays.asList("coffee")));
        drinks.add(new Drink("Latte", 3.50, Arrays.asList("coffee", "milk")));
        drinks.add(new Drink("Cappuccino", 3.50, Arrays.asList("coffee", "milk", "foam")));
    }

    public List<Drink> getAllDrinks() {
        return drinks;
    }

    public Drink getDrinkByName(String name) {

        Drink drink = drinks.stream()
                .filter(d -> d.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
        if (drink == null){
            throw  new ResourceNotFoundException("Not found  - " + name);
        }
        return drink;

    }
}
