package com.app.restraunt.apicontroller;

import com.app.restraunt.exception.ResourceNotFoundException;
import com.app.restraunt.model.Drink;
import com.app.restraunt.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drinks")
public class DrinkController {
    @Autowired
    private DrinkService drinkService;

    @GetMapping("get-all")
    public List<Drink> getAllDrinks() {
        return drinkService.getAllDrinks();
    }

    @GetMapping("/{name}")
    public Drink getDrinkByName(@PathVariable String name) throws ResourceNotFoundException {
        return drinkService.getDrinkByName(name);
    }
}

