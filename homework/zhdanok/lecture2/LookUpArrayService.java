package com.tutrit.java.quickstart.sevice;

public class LookUpArrayService {
    public int findMax(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            return findMaxIfNotZero(array);
        }
    }

    private int findMaxIfNotZero(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int indexOfMax(int[] array) {
        if (array.length == 0) {
            return -1;
        } else {
            return findMaxIndexIfNotZero(array);
        }
    }

    public int findMaxIndexIfNotZero(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;

            }
        }
        return index;
    }

}
