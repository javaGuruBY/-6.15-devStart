package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Dog;
import com.tutrit.java.quickstart.service.DogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
static Logger logger = LoggerFactory.getLogger("Application");

    public static void main(String[] args) {
        DogService dogService = new DogService();

        Dog lilDog = new Dog(4,"black");
        Dog biggyDog = new Dog(9,"brown");
        Dog shrimpyDog = new Dog(1,"pink");

        lilDog.name = "Lilly";
        biggyDog.name = "Champ";
        shrimpyDog.name = "Shrimp";

        logger.info("{}", lilDog);
        logger.info("{}",biggyDog);
        logger.info("{}",shrimpyDog);
    }
}

