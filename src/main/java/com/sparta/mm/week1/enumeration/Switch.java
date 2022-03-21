package com.sparta.mm.week1.enumeration;

public class Switch {
    private static int getDayNumber (String dayOfWeek){
        switch (dayOfWeek){
            case "Monday":
                return 1;
            case "Tuesday":
                return 2;
            case "Wednesday":
                return 3;
            case "Thursday":
                return 4;
            case "Friday":
                return 5;
            case "Saturday":
                return 6;
            case "Sunday":
                return 7;
        } return 0;
    }
}
