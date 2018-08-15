package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Provider {
    private String providerName;

    public ExtraFoodShop(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    @Override
    public String toString() {
        return "Extra Food Shop";
    }
}
