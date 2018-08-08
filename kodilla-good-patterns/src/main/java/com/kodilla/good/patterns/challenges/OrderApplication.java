package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderApplication {
    public static void main(String[] args) {
        User user1 = new User("Adam", "Nowak", "Warszawa");
        ItemOrder order1 = new ItemOrder(user1, "Game1", 1, 150.5, LocalDate.of(2018, 7, 15));
        SendingMessageService message1 = new SendingMessageService();
        message1.sendMessage(user1, order1);
    }
}
