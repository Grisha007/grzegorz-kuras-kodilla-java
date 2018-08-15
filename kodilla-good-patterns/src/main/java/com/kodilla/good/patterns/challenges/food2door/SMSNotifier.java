package com.kodilla.good.patterns.challenges.food2door;

public class SMSNotifier implements Notifier {
    @Override
    public void notify(User user) {
        System.out.println("Notification is sending to: " + user.getName() + ", on number: " + user.getPhoneNumber());
        System.out.println("--------------------------");
    }
}
