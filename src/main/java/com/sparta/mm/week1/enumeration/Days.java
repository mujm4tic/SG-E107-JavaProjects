package com.sparta.mm.week1.enumeration;

import java.util.Arrays;

public enum Days {
    MONDAY ("Today is Monday"),
    TUESDAY ("Today is Tuesday"),
    WEDNESDAY ("Today is Wednesday"),
    THURSDAY ("Today is Thursday"),
    FRIDAY ("Today is Friday"),
    SATURDAY ("Today is Saturday"),
    SUNDAY ("Today is Sunday");

    private String name;

    Days(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Days myDayObject = Days.WEDNESDAY;
        Days myDayObject2 = Days.THURSDAY;

        System.out.println(Arrays.toString(Days.values()));
    }

}
