package com.sparta.mm.week1.bubblesort;

import java.util.Arrays;

public class BSGeneric{
    public static void main(String[] args){
        int[] randArr = {3, 5, 2, 1, 6, 4};
        BubbleSort rearrangedArr = new BubbleSort();
        randArr = rearrangedArr.sortArr(randArr);
        rearrangedArr.printArr(randArr);
    }
}
