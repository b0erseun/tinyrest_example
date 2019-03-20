package com.tinyrest.app;

import java.time.LocalDateTime;
import java.util.List;

public class TinyServiceImpl implements TinyService {

    private final CustomerRepository customerRepo;

    public TinyServiceImpl(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public long createCustomer(Customer customer) {
        return customerRepo.createCustomer(customer);
    }

    @Override
    public List<Customer> search(String searchTerm) {
        List<Customer> found = customerRepo.findByName(searchTerm);
        found.addAll(customerRepo.findBySurname(searchTerm));
        return found;
    }

    @Override
    public List<Customer> findByAge(int age) {
        return customerRepo.findByAge(age);
    }
}
