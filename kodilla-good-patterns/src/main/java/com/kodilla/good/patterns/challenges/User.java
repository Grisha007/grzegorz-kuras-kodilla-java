package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String city;

    public User(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }
}
