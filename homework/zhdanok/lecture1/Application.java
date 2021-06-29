package com.tutrit.java.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    //static Logger log = LoggerFactory.getLogger("Application");

    public static void main(String[] args) {

        var usd = 2.5354;
        var eur = 3.0615;
        var uah = 9.1332 / 100;

        double inUsd = Double.valueOf(args[0]) / usd;
        double inEur = Double.valueOf(args[0]) / eur;
        double inUah = Double.valueOf(args[0]) / uah;

        System.out.println("inUsd = " + inUsd);
        System.out.println("inEur = " + inEur);
        System.out.println("inUah = " + inUah);


        //log.info("inUsd = {}, inEur = {}, inUah= {}", inUsd, inEur, inUah);
    }
}

