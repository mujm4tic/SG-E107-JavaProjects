package com.sparta.mm.week2.design_patterns.decorator.pizza;

public abstract class Pizza {
    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    private String description;
    private double cost;
}
