package com.tinyrest.app;

import java.time.LocalDateTime;
import java.util.List;

public interface TinyService {

     long createCustomer(Customer customer);

     List<Customer> search(String searchTerm);

     List<Customer>  findByAge(int age);



}
