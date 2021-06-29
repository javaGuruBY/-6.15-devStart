package com.tutrit.java.quickstart.sevice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LookUpArrayServiceTest {

    LookUpArrayService lookUpArrayService;

    @Before
    public void setUp() {
        lookUpArrayService = new LookUpArrayService();
    }

    @Test
    public void findMaxPositive() {
        int[] array = {12, -7, 145, 800, -678, 0, 89};
        int actual = lookUpArrayService.findMax(array);
        int expected = 800;
        assertEquals(expected, actual);

    }

    @Test
    public void findMaxIfZero() {
        int[] array = new int[0];
        int actual = lookUpArrayService.findMax(array);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxNegative() {
        int[] array = {12, -7, 145, 800, -678, 0, 89};
        int actual = lookUpArrayService.findMax(array);
        int expected = -678;
        assertNotEquals(expected, actual);

    }

    @Test
    public void indexOfMax() {
        int[] array = {12, 801, 145, 800, -678, 0, 890};
        int actual = lookUpArrayService.indexOfMax(array);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMaxIfZero() {
        int[] array = new int[0];
        int actual = lookUpArrayService.indexOfMax(array);
        int expected = -1;
        assertEquals(expected, actual);
    }

}