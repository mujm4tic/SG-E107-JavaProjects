package com.sparta.mm.week2.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("This is my file"));
        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } finally {
            System.out.print("I am in the finally block");
        }
    }
}

// UNCHECKED
//    arrayChecker (new int[]{1,2,3,4}, 10);
//    private static int arrayChecker(int[] array, int position) throws ArrayIndexOutOfBoundsException{
//        return array[position];
//    }
