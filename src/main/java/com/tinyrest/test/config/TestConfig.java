package com.tinyrest.test.config;

import com.tinyrest.app.CustomerRepoImpl;
import com.tinyrest.app.CustomerRepository;
import com.tinyrest.app.TinyService;
import com.tinyrest.app.TinyServiceImpl;
import com.tinyrest.core.beans.Bean;
import com.tinyrest.core.server.RestApplication;
import com.tinyrest.core.server.annotations.Configuration;
import com.tinyrest.core.server.cleanup.Cleanup;
import com.tinyrest.test.controller.TinyController;

@Configuration
public class TestConfig {


    @Bean
    public CustomerRepository customerRepository() {
        return new CustomerRepoImpl();
    }

    @Bean
    public TinyService tinyService(CustomerRepository customerRepo) {
        return new TinyServiceImpl(customerRepo);
    }

    @Bean
    public TinyController tinyController(TinyService tinyService) {
        return new TinyController(tinyService);
    }

    @Bean
    public Cleanup cleanup() {
        Cleanup cleanup = new MyCleanup();
        RestApplication.registerObjectForCleanup(cleanup);
        return cleanup;
    }



}
