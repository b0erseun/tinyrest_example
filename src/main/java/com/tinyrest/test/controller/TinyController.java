package com.tinyrest.test.controller;

import com.tinyrest.app.Customer;
import com.tinyrest.app.TinyService;
import com.tinyrest.core.server.annotations.PathVariable;
import com.tinyrest.core.server.annotations.RequestBody;
import com.tinyrest.core.server.annotations.RequestMapping;
import com.tinyrest.core.server.annotations.RestController;
import com.tinyrest.core.server.request.RequestMethod;
import com.tinyrest.core.server.response.HttpStatus;
import com.tinyrest.core.server.response.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(path = "/tiny")
public class TinyController {

    private final TinyService tinyService;

    public TinyController(TinyService tinyService) {
        this.tinyService = tinyService;
    }

    @RequestMapping(path = "/customer", method = RequestMethod.POST)
    public ResponseEntity<Long>  createCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(tinyService.createCustomer(customer), HttpStatus.CREATED);
    }

    @RequestMapping(path = "/customer/{searchTerm}")
    public ResponseEntity<List<Customer>> searchCustomer(@PathVariable("searchTerm")  String searchTerm) {
        return new ResponseEntity<>(tinyService.search(searchTerm), HttpStatus.OK);
    }



}
