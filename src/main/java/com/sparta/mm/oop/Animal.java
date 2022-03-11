package com.sparta.mm.oop;

public abstract class Animal {
    private String name;
    private String breed;
    private int age;

    //constructor
    public Animal (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    //get and set

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("The animal is speaking");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}


//extras
//    public void speak(String animal){
//        System.out.println(animal + " is speaking");
//    }