package com.tinyrest.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerRepoImpl implements CustomerRepository {

    private final List<Customer> customers = new ArrayList<>();


    @Override
    public long createCustomer(Customer customer) {
        customers.add(customer);
        return customers.size();
    }

    @Override
    public List<Customer> findByName(String name) {
        return customers.stream()
                .filter(c -> c.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> findBySurname(String surname) {
        return customers.stream()
                .filter(c -> c.getSurname().equalsIgnoreCase(surname))
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> findByAge(int age) {
        return customers.stream()
                .filter(c -> c.getAge() == age)
                .collect(Collectors.toList());
    }
}
