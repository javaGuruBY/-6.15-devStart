package com.tutrit.java.random_generator.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RandomGeneratorServiceTest {
    RandomGeneratorService randomGeneratorService;

    @Before
    public void setUp() {
        randomGeneratorService = new RandomGeneratorService();
    }

    @Test
    public void generateRandomNumber() {
        int actual = randomGeneratorService.generateRandomNumber(10);
    }

    @Test
    public void printTheNumber() {
        randomGeneratorService.printTheNumber(4);
    }

    @Test
    public void sumOfNumbers() {
        int a = 3;
        int b = 4;
        int c = 3;
        int expected = 10;
        int actual = randomGeneratorService.sumOfNumbers(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    public void run() {
        randomGeneratorService.run();
    }
}
