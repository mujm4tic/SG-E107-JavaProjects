package com.sparta.mm.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

        @Test
        @DisplayName("Five should return Fizz")
        void fiveShouldReturnFizz() {
            assertEquals("Fizz", FizzBuzzGenerator.getFizzBuzzValue(5));
        }

        @Test
        @DisplayName("Seven should return Buzz")
        void sevenShouldReturnBuzz() {
            assertEquals("Buzz", FizzBuzzGenerator.getFizzBuzzValue(7));
        }

        @Test
        @DisplayName("35 should return FizzBuzz")
        void thirtyfiveShouldReturnFizzBuzz() {
            assertEquals("FizzBuzz",FizzBuzzGenerator.getFizzBuzzValue(35));
        }

        @Test
        @DisplayName("29 should return 29")
        void twentynineShouldReturnSorryString() {
            Assertions.assertEquals("29", FizzBuzzGenerator.getFizzBuzzValue(29));
        }
}
