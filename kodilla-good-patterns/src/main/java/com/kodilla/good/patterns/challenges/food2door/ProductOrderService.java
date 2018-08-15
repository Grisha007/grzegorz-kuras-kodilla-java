package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderService {
    private String serviceName;

    public ProductOrderService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void orderProduct(Provider provider, Repository repository, Notifier notifier, User user, Order order) {
        if(provider.process(repository, order) == true) {
            notifier.notify(user);
        } else if(provider.process(repository, order) == false) {
            notifier.notify(user);
        } else {
            System.out.println("Error occured");
        }
    }
}
