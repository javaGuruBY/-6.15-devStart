package com.tutrit.java.quickstart.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog {


    int age;
    String color;
    public String name;
    Logger log = LoggerFactory.getLogger("Dog");

    public Dog(int a, String col) {
        this.age = a;
        this.color = col;
        log.info("dog has been created");
        log.info("{}", age);
        log.info("{}", color);
        voice();
        eat();
        sleep();
    }

    public void voice() {
        log.info("hau hau");
    }

    public void eat() {
        log.info("slurp slurp slurp");
    }

    public void sleep() {
        log.info("Zzz");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
