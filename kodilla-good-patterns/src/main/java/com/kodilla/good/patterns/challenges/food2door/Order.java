package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private Provider provider;
    private String productName;
    private double price;
    private double quantity;

    public Order(Provider provider, String productName, double price, double quantity) {
        this.provider = provider;
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

    public Provider getProvider() {
        return provider;
    }
}
