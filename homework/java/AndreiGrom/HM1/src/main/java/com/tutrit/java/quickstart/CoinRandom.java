package com.tutrit.java.quickstart;

import java.util.Random;
import java.util.logging.Logger;

public class CoinRandom {
    private int cast;

    public CoinRandom() {
        Random random = new Random();
        Coin(random.nextInt(2));
    }

    public int getCast() {
        return cast;
    }

    private void Coin(int cast) {
        Logger log = Logger.getLogger(CoinRandom.class.getName());
        if (cast == 0) {
            log.info("Орел");
        } else {
            log.info("Решка");
        }
    }

}
