package com.cofig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by debasish paul on 11-07-2017.
 */
@SpringBootApplication
@ComponentScan({"com.cofig","com.controller"})
public class Application {
    static Logger LOGGER = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
