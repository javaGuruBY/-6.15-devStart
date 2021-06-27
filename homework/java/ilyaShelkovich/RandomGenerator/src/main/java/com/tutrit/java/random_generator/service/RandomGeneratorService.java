package com.tutrit.java.random_generator.service;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomGeneratorService {

    Logger log = LoggerFactory.getLogger(RandomGeneratorService.class);
    //1. Сгенерировать 3 случайных числа и вывести их на экран.
    Random random = new Random();

    public int firstNumGenerator() {
        return random.nextInt(100);
    }

    public int secondNumGenerator() {
        return random.nextInt(100);
    }

    public int thirdNumGenerator() {
        return random.nextInt(100);
    }

    public void printGeneratedNums() {
        log.info("{}", firstNumGenerator());
        log.info("{}", secondNumGenerator());
        log.info("{}", thirdNumGenerator());
    }
    //2. Посчитать сумму этих чисел и вывести результат на экран.

    // заново вызывает работу методов, переписать.
    public int sumOfGeneratedNums() {
        return firstNumGenerator() + secondNumGenerator() + thirdNumGenerator();
    }

    public void printSumOfGeneratedNums() {
        log.info("{}", sumOfGeneratedNums());
    }

      /*  тесты:
    1. подтвердить что числа рандомные, сделать так чтобы числа не повторялись
    2. подтвердить что числа в заданных границах

       */
}
