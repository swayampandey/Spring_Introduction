package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Hello From Bridgelabz");
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
