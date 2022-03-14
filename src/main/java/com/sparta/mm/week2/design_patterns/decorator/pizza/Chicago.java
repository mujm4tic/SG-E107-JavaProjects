package com.sparta.mm.week2.design_patterns.decorator.pizza;

public class Chicago extends Pizza{
    @Override
    public String getDescription() {
        return "Chicago";
    }

    @Override
    public double getCost() {
        return 30;
    }
}
