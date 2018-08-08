package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ItemOrder {
    private User user;
    private String itemName;
    private int quantity;
    private double price;
    private LocalDate orderDate;

    public ItemOrder(User user, String itemName, int quantity, double price, LocalDate orderDate) {
        this.user = user;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
