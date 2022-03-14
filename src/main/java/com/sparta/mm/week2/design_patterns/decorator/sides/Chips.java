package com.sparta.mm.week2.design_patterns.decorator.sides;

import com.sparta.mm.week2.design_patterns.decorator.pizza.Pizza;

public class Chips extends Sides {

    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return "Chips";
    }



}
