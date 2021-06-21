package com.tutrit.java.quickstart;

import java.util.Random;

public class Coin {

    public Coin() {
    }

    public String coinFlipping() {
      String  result = "";
      boolean resultBoolean;
        Random random = new Random();
        resultBoolean = random.nextBoolean();
        result = resultBoolean ? "Орел" : "Решка";
      return result;
    }
}
