package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalService implements Barkable {
    private Animal animal;
    private Logger log;

    public AnimalService(Animal animal) {
        this.animal = animal;
        log = LoggerFactory.getLogger(animal.getClass());
    }

    @Override
    public void bark() {
        log.info("dog say");
        log.info("hau hau");
    }
}
