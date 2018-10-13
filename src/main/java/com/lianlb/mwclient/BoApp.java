package com.lianlb.mwclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@ComponentScan(basePackages = {"com.lianlb"})
public class BoApp extends SpringBootServletInitializer {

//    public static void main(String[] args) {
//        SpringApplication.run(new Object[]{BoApp.class, MyServletContainerInitializer.class}, args);
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BoApp.class);
    }
}
