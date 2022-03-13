package com.sparta.mm.fibonacci;

public class FibonacciFinder {
    public static void main(String[] args) {
        int n = 35;
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n<= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
