package com.tutrit.java.random_generator;

import com.tutrit.java.random_generator.service.RandomGeneratorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        var randomGeneratorService = new RandomGeneratorService();

        randomGeneratorService.run();

    }
}
