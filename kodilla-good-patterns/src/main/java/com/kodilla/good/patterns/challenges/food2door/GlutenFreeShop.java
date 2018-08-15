package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Provider {
    private String providerName;

    public GlutenFreeShop(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    @Override
    public String toString() {
        return "Gluten Free Shop";
    }
}
