package com.sparta.mm.week1.fibonacci;

public class RecursionExample {

    public static int addRecursively(int max){

        if(max > 0){
            return max + addRecursively(max -1);
        } else return 0;
    }

}