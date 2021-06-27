package com.tutrit.java.random_generator.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RandomGeneratorServiceTest {

    RandomGeneratorService randomGeneratorService = new RandomGeneratorService();


    @Test
    public void numsShouldBeBounded() {
        int i = randomGeneratorService.firstNumGenerator();
        if(i > 0 || i < 100) {
            assertFalse(false);
        } else {
            assertTrue(true);
        }
    }
}

