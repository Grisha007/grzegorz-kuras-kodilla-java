package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorRunner {
    public static void main(String[] args) {
        ProductOrderService pos = new ProductOrderService("Product Order Service");
        Repository dataRepository = new DataRepository("Data repository");
        Notifier emailNotifier = new EmeailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        User user1 = new User("John Smith", "john.smith@gmail.com", "587412368");
        User user2 = new User("Adam Nowak", "adam.nowak@gmail.com", "523120548");
        User user3 = new User("Harry Potter", "harry.potter@hogwart.com", "987654321");

        Provider extraFoodShop = new ExtraFoodShop("Extra Food Shop");
        Provider healthlyShop = new HealthyShop("Healthly Shop");
        Provider glutenFreeShop = new GlutenFreeShop("Gluten Free Shop");

        Order order1 = new Order(extraFoodShop,"Carrot Bar", 2.5, 1.0);
        Order order2 = new Order(healthlyShop, "Healthly Pizza", 20.0, 1.0);
        Order order3 = new Order(glutenFreeShop, "Gluten Free Sandwich", 1.0, 17.0);

        pos.orderProduct(extraFoodShop, dataRepository, emailNotifier, user1, order1);
        pos.orderProduct(healthlyShop, dataRepository, emailNotifier, user2, order2);
        pos.orderProduct(glutenFreeShop,dataRepository, smsNotifier, user3, order3);
    }
}
