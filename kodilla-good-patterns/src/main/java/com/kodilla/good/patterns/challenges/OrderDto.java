package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    private List<String> orders = new ArrayList<>();

    public void addOrderToList() {
        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");
    }

    public List<String> getOrders() {
        return orders;
    }
}
