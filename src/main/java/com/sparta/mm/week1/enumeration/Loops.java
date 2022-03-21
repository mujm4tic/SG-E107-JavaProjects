package com.sparta.mm.week1.enumeration;

public class Loops {
    private static int getDayNumber(String dayOfWeek) {
        if ("Monday".equals(dayOfWeek)) {
            return 1;
        } else if ("Tuesday".equals(dayOfWeek)) {
            return 2;
        } else if ("Wednesday".equals(dayOfWeek)) {
            return 3;
        } else if ("Thursday".equals(dayOfWeek)) {
            return 4;
        } else if ("Friday".equals(dayOfWeek)) {
            return 5;
        } else if ("Saturday".equals(dayOfWeek)) {
            return 6;
        } else if ("Sunday".equals(dayOfWeek)) {
            return 7;
        }
        return 0;
    }
}
