package com.tutrit.java.quickstart;

import java.util.Arrays;
import java.util.Random;

public class Coinflipping {
    public static void main(String[] args) {
        int nrOfThrows = 100;
        int[] diffNr = new int[nrOfThrows];

        int plays = 1000;
        for (int i = 0; i < plays; i++) {
            diffNr[play(nrOfThrows)]++;
        }
        System.out.println(Arrays.toString(diffNr));
    }

    static int play(final int nr) {
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < nr; i++) {
            Random random = new Random();
            int rnd = random.nextInt(2);

            if (rnd == 0) {
                heads++;
            } else {
                tails++;
            }
        }
        return Math.abs(heads - tails);
    }
}