package food2door;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        User user1 = new User("Adam", "Nowak");
        User user2 = new User("Jan", "Kowalski");

        NewFoodManufacturer healthlyBurgerShop = new NewFoodManufacturer("Healthly Burger Food", "Street1", "City1");
        healthlyBurgerShop.addProductToTheList(healthlyBurgerShop, "Product1");
        healthlyBurgerShop.addProductToTheList(healthlyBurgerShop, "Product2");
        healthlyBurgerShop.addProductToTheList(healthlyBurgerShop, "Product3");
        healthlyBurgerShop.printNewManufacturerProductsList();

        NewFoodManufacturer extraFoodShop = new NewFoodManufacturer("ExtraFoodShop", "Street2", "City2");
        extraFoodShop.addProductToTheList(extraFoodShop, "Product1");
        extraFoodShop.addProductToTheList(extraFoodShop, "Product2");
        extraFoodShop.addProductToTheList(extraFoodShop, "Product3");
        extraFoodShop.printNewManufacturerProductsList();

        NewFoodManufacturer glutenFreeShop = new NewFoodManufacturer("GlutenFreeShop", "Street3", "City3");
        glutenFreeShop.addProductToTheList(glutenFreeShop, "Product1");
        glutenFreeShop.addProductToTheList(glutenFreeShop, "Product2");
        glutenFreeShop.addProductToTheList(glutenFreeShop, "Product3");
        glutenFreeShop.printNewManufacturerProductsList();

        NewFoodManufacturer healthyShop = new NewFoodManufacturer("HealthyShop", "Street4", "City4");
        healthyShop.addProductToTheList(healthyShop, "Product1");
        healthyShop.addProductToTheList(healthyShop, "Product2");
        healthyShop.addProductToTheList(healthyShop, "Product3");
        healthyShop.printNewManufacturerProductsList();

        Order order1 = new Order("Order1");
        order1.orderDto(order1, user1, healthlyBurgerShop, "Product1");

        Order order2 = new Order("Order2");
        order2.orderDto(order2, user1, extraFoodShop, "Product3");

        Order order3 = new Order("Order3");
        order3.orderDto(order3, user2, glutenFreeShop, "Product4");

        Order order4 = new Order("Order4");
        order4.orderDto(order4, user2, healthyShop, "Product5");
    }
}
