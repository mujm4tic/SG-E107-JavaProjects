package com.sparta.mm.oop;

public class Cat extends Animal{

    public Cat(String name, String breed, int age){
        super(name, breed, age);
    }

    @Override
    public void speak(){
        System.out.println("I'm a cat, prrrrrr");
    }
}
