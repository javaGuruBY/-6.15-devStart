package com.tutrit.java.quickstart.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringAnalyserService {

    public List<String > splitStringIntoWords(String originalText) {
        List<String> words = new ArrayList(Arrays.asList(originalText.split("(\\p{Punct})|(\\p{Blank})|(\\p{Digit})|(\\n)")));
        words.removeIf(s ->s.equals(""));
        return words;
    }

    public List<String> splitStringIntoPunctuationMarks(String originalText) {
        List<String> words = new ArrayList(Arrays.asList(originalText.split("(\\p{Alpha})|(\\p{Blank})|(\\p{Digit})|(\\n)")));
        words.removeIf(s ->s.equals(""));
        return words;
    }
}
