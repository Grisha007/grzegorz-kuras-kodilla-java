package com.kodilla.good.patterns.challenges.food2door;

public class EmeailNotifier implements Notifier {
    @Override
    public void notify(User user) {
        System.out.println("Notification is sending to: " + user.getName() + ", on email: " + user.getEmail());
        System.out.println("--------------------------");
    }
}
