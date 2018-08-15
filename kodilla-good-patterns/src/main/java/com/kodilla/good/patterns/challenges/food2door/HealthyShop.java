package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Provider {
    private String providerName;

    public HealthyShop(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    @Override
    public String toString() {
        return "Healthy Shop";
    }
}
