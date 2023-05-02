package com.app.restraunt.service;

import com.app.restraunt.model.Customer;
import com.app.restraunt.model.Drink;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {
    private Map<Customer, List<Drink>> orders = new HashMap<>();

    public double getTotalCost(Customer customer) {
        List<Drink> customerOrders = orders.get(customer);
        return customerOrders.stream()
                .mapToDouble(Drink::getPrice)
                .sum();
    }

    public void addDrinkToOrder(Customer customer, Drink drink) {
        orders.computeIfAbsent(customer, k -> new ArrayList<>()).add(drink);
    }

    public void removeDrinkFromOrder(Customer customer, Drink drink) {
        orders.computeIfPresent(customer, (k, v) -> {
            v.remove(drink);
            return v;
        });
    }
}
