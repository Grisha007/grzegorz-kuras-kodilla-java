package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderService {
    private OrderDto orderDto;

    public void process(OrderDto orderDto) {
        System.out.println(orderDto.getOrders());
        System.out.println("Sending orders to database");
    }
}
