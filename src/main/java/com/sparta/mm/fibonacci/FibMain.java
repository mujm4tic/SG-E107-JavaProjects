package com.sparta.mm.fibonacci;

import static com.sparta.mm.fibonacci.FibonacciFind.getFibonacci;

public class FibMain {
    public static void main(String args[]) {
        int position = 34;
        for (int i = 1; i <= position; i++){
            System.out.println(getFibonacci(i));
        }
    }
}

/**based on colleague advice
 * not working after modification - fix
 * work through logic again
 */
