package com.tinyrest.app;

public class Customer {
    private final String firstName;
    private final String surname;
    private final int age;

    public Customer(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
