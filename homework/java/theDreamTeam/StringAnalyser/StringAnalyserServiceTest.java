package com.tutrit.java.quickstart.service;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.tutrit.java.quickstart.constant.Text.ORIGINAL_TEXT;
import static org.junit.Assert.*;

public class StringAnalyserServiceTest {

    StringAnalyserService stringAnalyserService;
    String originalText;

    @Before
    public void setUp(){
        stringAnalyserService = new StringAnalyserService();
        originalText = "ghj sdgas? Sgsdg,sdg dfsg -sdg  lsg. Sgw 200 fwefwe; sdf ds sfse! sgsd fse.";
    }

    @Test
    public void splitStringIntoWords_Positive (){
        List<String> actual = stringAnalyserService.splitStringIntoWords(originalText);
        List<String> expected = new ArrayList<>();
        expected.add("ghj");
        expected.add("sdgas");
        expected.add("Sgsdg");
        expected.add("sdg");
        expected.add("dfsg");
        expected.add("sdg");
        expected.add("lsg");
        expected.add("Sgw");
        expected.add("fwefwe");
        expected.add("sdf");
        expected.add("ds");
        expected.add("sfse");
        expected.add("sgsd");
        expected.add("fse");
        assertEquals(expected,actual);
    }

    @Test
    public void splitStringIntoWords_Negative (){
        List<String> actual = stringAnalyserService.splitStringIntoWords(originalText);
        List<String> expected = new ArrayList<>();
        expected.add("ghj");
        expected.add("sdgas");
        expected.add("Sgsdg");
        expected.add("sdg");
        expected.add("dfsg");
        expected.add("sdg");
        expected.add("lsg");
        expected.add("Sgw");
        expected.add("fwefwe");
        expected.add("sdf");
        expected.add("ds");
        expected.add("sfse");
        expected.add("sgsd");
        expected.add("fsg");
        assertNotEquals(expected,actual);
    }

    @Test
    public void splitStringIntoPunctuationMarks_Positive (){
        List<String> actual = stringAnalyserService.splitStringIntoPunctuationMarks(originalText);
        List<String> expected = new ArrayList<>();
        expected.add("?");
        expected.add(",");
        expected.add("-");
        expected.add(".");
        expected.add(";");
        expected.add("!");
        expected.add(".");
        assertEquals(expected,actual);
    }

    @Test
    public void splitStringIntoPunctuationMarks_Negative (){
        List<String> actual = stringAnalyserService.splitStringIntoPunctuationMarks(originalText);
        List<String> expected = new ArrayList<>();
        expected.add("?");
        expected.add(",");
        expected.add("-");
        expected.add(".");
        expected.add(";");
        expected.add("!");
        expected.add("@");
        assertNotEquals(expected,actual);
    }

}