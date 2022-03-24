package com.sparta.mm.week3.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Functional {
    public static void main(String[] args) {
        printBeatles();
        //Check if string contains every letter of alphabet


        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean containsAllLetters =
                sentence.toLowerCase(Locale.ROOT).chars()
                        .filter(letter -> letter >= 'a' && letter <= 'z')
                        .distinct()
                        .count() == 26;
        System.out.println(containsAllLetters);

    }

    private static void printBeatles() {
        ArrayList<String> beatles = new ArrayList<>(Arrays.asList("John", "Paul", "George", "Ringo"));
        beatles.stream()
                .filter(name -> name.contains("o")) //intermediate
                .map(name -> name.toUpperCase()) //intermediate
                .forEach(name -> System.out.println(name));
        System.out.println(beatles);
    }
}
