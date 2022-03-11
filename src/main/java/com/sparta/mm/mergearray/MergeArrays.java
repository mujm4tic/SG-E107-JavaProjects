package com.sparta.mm.mergearray;

import java.util.Arrays;

public class MergeArrays {

    public static int[] mergeA(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] newArray;
        newArray = new int[length];
        int positionArray2 = 0;
        int positionArray1 = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (array1[positionArray1] <= array2[positionArray2]) {
                newArray[i] = array1[positionArray1];
                positionArray1++;
            } else {
                newArray[i] = array2[positionArray2];
                positionArray2++;
            }
            Arrays.toString(newArray);

        }
        return newArray;
    }
}

//
//    int[] newArray = new int[array1.length + array2.length];
//    //stopper as any point
//    boolean stop = false;
//    int j = 0;
//    int position = 0;
//        while(stop){
//                stop = true
//                for(int i = 0; i < array1.length-1; i++){
//        if(array1[i] <= array2[j]){
//        newArray[position] = array1[i];
//        position = position++;
//        stop = false;
//        } else{
//        newArray[j] = array2[]
//        stop = false
//        }
//        }
//        }