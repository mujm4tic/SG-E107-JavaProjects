package com.sparta.mm.week1.calculator;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.subtract(12, 34));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation? (a or s, x to exit)");
        String choice = scanner.next(); //add or subtract or exit?
        while(!choice.equals("x")){
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt(); //choose 1st number
            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt(); //choose 2nd number
            if(choice.equals("a")){
                System.out.println(calc.add(firstNumber, secondNumber));
            } else if(choice.equals("s")) {
                System.out.println(calc.subtract(firstNumber, secondNumber));
            }
            System.out.println("Which operation? (a or s, x to exit)");
            choice = scanner.next(); //add or subtract or exit?
        }
        System.out.println("Thanks for using this calculator :)");
    }
}

/**FUTURE IMPROVEMENTS
 * add division, multiplication, and other operations
 * tests
 * clean up the main and separate classes SOLID OOP
 */
