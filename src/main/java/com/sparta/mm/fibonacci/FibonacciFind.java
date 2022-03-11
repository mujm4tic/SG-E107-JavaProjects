package com.sparta.mm.fibonacci;

public class FibonacciFind {
        public static int getFibonacci(int number){
            //working function
            if(number > 2){
                return (number-2) + getFibonacci(number-1);
            //kickstart phase
            } else if (number == 2){
                return 1;
            } else if(number == 1){
                return 0;
            } else{
                return 0;
            }
        }
    }
