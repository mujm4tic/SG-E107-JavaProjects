package com.sparta.mm.week1.mergearray;

import java.util.Arrays;

public class MergeArrays {

    public static int[] mergeA(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] newArray;
        newArray = new int[length];
        int positionArray2 = 0;
        int positionArray1 = 0;
        int positionNewArray = 0;
        for (int i = positionNewArray; i < newArray.length; i++) {
            if (array1[positionArray1] <= array2[positionArray2]) {
                newArray[i] = array1[positionArray1];
                if (positionArray1 < array1.length - 1) {
                    positionArray1++;
                } else {
                    positionNewArray = i;
                    break;
                }
            } else if (array2[positionArray2] <= array1[positionArray1]) {
                newArray[i] = array2[positionArray2];
                if (positionArray2 < array2.length - 1) {
                    positionArray2++;
                } else {
                    positionNewArray = i;
                    break;
                }
            }
        }
        for (int j = positionNewArray; j < newArray.length; j++) {
            if (positionArray1 < array1.length) {
                newArray[j] = array1[positionArray1];
                positionArray1++;
            } else if (positionArray2 < array2.length) {
                newArray[j] = array2[positionArray2];
                positionArray2++;
            } else break;
        }
        return newArray;
    }
}