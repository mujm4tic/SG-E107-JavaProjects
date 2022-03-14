package com.sparta.mm.week2.design_patterns.decorator.pizza;

public class Italian extends Pizza{

    @Override
    public String getDescription() {
        return "Italian";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
