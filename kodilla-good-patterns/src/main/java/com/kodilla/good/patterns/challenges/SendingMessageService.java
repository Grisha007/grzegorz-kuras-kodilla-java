package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SendingMessageService {
    private User user;
    private ItemOrder order;
    private LocalDate messageDate;

    public void sendMessage(User user, ItemOrder order){
        messageDate = LocalDate.now();
        System.out.println("Thank you for your order " + user.getName() + " " + user.getSurname() + ". " + "Order has been approved. " + "Details: \n" + "Item: " + order.getItemName() + "\n" + "Quantity: " + order.getQuantity() + "\n" + "Price: " + order.getPrice() + "\n" + messageDate);
    }
}