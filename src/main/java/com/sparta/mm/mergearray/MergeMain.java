package com.sparta.mm.mergearray;

import java.util.Arrays;

public class MergeMain {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,4,5,6,7};
        System.out.println(Arrays.toString(MergeArrays.mergeA(array1,array2)));
    }
}


/**CONTINUOUS IMPROVEMENT
 * trouble shoot edited mergeA method
 * randomised int array generation - pull out of main
 * testing
 */