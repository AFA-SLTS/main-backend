package com.afa.mainbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMainBackendApplication {

    public static void main(String[] args) {
        SpringApplication.from(MainBackendApplication::main).with(TestMainBackendApplication.class).run(args);
    }

}
