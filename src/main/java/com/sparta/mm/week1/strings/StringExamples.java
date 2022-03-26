package com.sparta.mm.week1.strings;

public class StringExamples {

    //STRING PRACTICE
    public static void main(String[] args) {
        String name = "Manish";
        for (char letter : name.toCharArray()){
            System.out.println(name.toCharArray());
        }

        //primitve objects and object types = variable.

        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = "Hello World";
        String s4 = new String ("Hello World");
        String s5 = new String ("Hello World");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));

        s4 = s4.intern();
        //points to same value object in String pool so String pool object can be returned

        System.out.println(s1 == s2);
        System.out.println(s1 == s5); // compares objects not contents, but primitive values compared
        System.out.println(s1.equals(s5)); //compares contents

    }
}
