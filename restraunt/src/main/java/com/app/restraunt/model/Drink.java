package com.app.restraunt.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@ToString
@Data
@Getter
@Setter
public class Drink {
    private String name;
    private double price;
    private List<String> ingredients;

    public Drink(String name, double price, List<String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
}
