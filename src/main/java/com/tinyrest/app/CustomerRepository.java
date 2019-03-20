package com.tinyrest.app;

import java.util.List;

public interface CustomerRepository {

    long createCustomer(Customer customer);

    List<Customer> findByName(String name);

    List<Customer> findBySurname(String surname);

    List<Customer> findByAge(int age);



}
