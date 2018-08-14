package com.kodilla.good.patterns.challenges.orderservice;

public class Order {
    private String productName;
    private double price;
    private double quantity;

    public Order(String productName, double price, double quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}
