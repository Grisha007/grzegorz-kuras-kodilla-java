package com.kodilla.good.patterns.challenges.orderservice;

import java.util.Random;

public class GSMshop implements Provider {
    private String providerName;

    public GSMshop(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    @Override
    public boolean productCheck(Repository repository, Order order) {
        Random rnd = new Random();
        boolean result = rnd.nextBoolean();

        if(result == true) {
            System.out.println("Status: " + result);
            System.out.println("Product is available.");
            System.out.println("Order: \"" + order.getProductName() + "\" has been realised.");
            repository.repositoryUpdate();
        } else if(result == false) {
            System.out.println("Status: " + result);
            System.out.println("Product is unavailable.");
            System.out.println("Order: \"" + order.getProductName() + "\" cannot be realised.");
        } else {
            System.out.println("Error occured.");
        }
        return true;
    }
}
