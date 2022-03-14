package com.sparta.mm.week1.bubblesort;

public class BSMain {
    public static void main(String[] args){
        int[] randArr = {3, 5, 2, 1, 6, 4};
        BubbleSort rearrangedArr = new BubbleSort();
        randArr = rearrangedArr.sortArr(randArr);
        rearrangedArr.printArr(randArr);
    }
}

/**UPCOMING IMPROVEMENTS
 * randomizing randArr
 * tests
 * bubbleosrt() static for direct call?
 * rename variables and make more readable
 */

