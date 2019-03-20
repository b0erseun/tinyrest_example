package com.tinyrest.test;


import com.tinyrest.core.server.RestApplication;
import com.tinyrest.core.server.annotations.RestService;

@RestService(name = "Tinytest")
public class TinyRestTestApp {

    public static void main(String[] args) throws Exception{

        RestApplication.run(args, TinyRestTestApp.class);

    }

}
