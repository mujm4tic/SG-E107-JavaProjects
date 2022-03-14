package com.sparta.mm.week2.design_patterns.decorator.sides;

import com.sparta.mm.week2.design_patterns.decorator.pizza.Pizza;

public class Salad extends Sides {

    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String getDescription() {
        return "Chips";
    }
}
