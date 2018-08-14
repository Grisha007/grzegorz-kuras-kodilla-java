package com.kodilla.good.patterns.challenges;

public class OrderServiceRunner {
    public static void main(String[] args) {
        Provider gsmShop = new GSMshop("GSMShop");
        Repository dataRepository = new DataRepository("Data repository");
        Notifier notifier = new SMSNotifier();
        User user1 = new User("John Smith", "1234567890");
        Order order1 = new Order("Samsung Galaxy S8", 2500.0, 1.0);
        ProductOrderService pos = new ProductOrderService("Product Order Service");

        pos.orderProduct(gsmShop, dataRepository, notifier, user1, order1);
    }
}
