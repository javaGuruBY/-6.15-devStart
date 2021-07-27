package com.tutrit.java.random_generator.service;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomGeneratorService {

    Logger log = LoggerFactory.getLogger(RandomGeneratorService.class);

    public int generateRandomNumber(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }

    public void printTheNumber(int a) {
        log.info("{}", a);
    }

    public int sumOfNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public void run() {
        int a = generateRandomNumber(10);
        int b = generateRandomNumber(10);
        int c = generateRandomNumber(10);

        printTheNumber(a);
        printTheNumber(b);
        printTheNumber(c);

        int sum = sumOfNumbers(a, b, c);

        printTheNumber(sum);

    }
}
