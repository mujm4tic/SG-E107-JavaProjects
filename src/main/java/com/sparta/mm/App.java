package com.sparta.mm;

public class App {
    public static void main(String[] args){
        Cat felix = new Cat("Felix", "Mane Coon", 7);
        Dog peter = new Dog("Peter", "Poodle", 3);
        felix.setAge(4);
        System.out.println(felix);
        felix.speak();
        peter.speak();
        peter.speak("Jeremy");
    }
}
