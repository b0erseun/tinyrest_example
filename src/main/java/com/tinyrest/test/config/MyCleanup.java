package com.tinyrest.test.config;

import com.tinyrest.core.server.cleanup.Cleanup;

public class MyCleanup implements Cleanup {

    @Override
    public void cleanup() {
        System.out.println("Cleaning up...");
    }
}
