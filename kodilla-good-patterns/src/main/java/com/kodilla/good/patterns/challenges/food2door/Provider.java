package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public interface Provider {
    default boolean process(Repository repository, Order order) {
        Random rnd = new Random();
        boolean result = rnd.nextBoolean();

        if(result == true) {
            System.out.println("Processing order from: " + order.getProvider());
            System.out.println("Status: " + result);
            System.out.println("Product is available.");
            System.out.println("Order: \"" + order.getProductName() + "\" has been realised.");
            repository.repositoryUpdate();
        } else if(result == false) {
            System.out.println("Processing order from: " + order.getProvider());
            System.out.println("Status: " + result);
            System.out.println("Product is unavailable.");
            System.out.println("Order: \"" + order.getProductName() + "\" cannot be realised.");
        } else {
            System.out.println("Error occured.");
        }
        return true;
    }
}
