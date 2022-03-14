package com.sparta.mm.week2.design_patterns.factory;

public class Cat implements Speaker{
    @Override
    public String speak() {
        return "Meow";
    }
}
