package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private String serviceName;

    public ProductOrderService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void orderProduct(Provider provider, Repository repository, Notifier notifier, User user, Order order) {
        if(provider.productCheck(repository, order) == true) {
            notifier.notify(user);
        } else if(provider.productCheck(repository, order) == false) {
            notifier.notify(user);
        } else {
            System.out.println("Error occured");
        }
    }
}
