package com.sparta.mm.week1.palindrome;

public class PalindromeCheck {
    public static boolean isPalindrome(String wordCheck){
        String reverse = "";
        int length = wordCheck.length();
        for(int i = length -1; i>=0; i-- ){ //review logic
            reverse = reverse + wordCheck.charAt(i);
        }   return wordCheck.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {
        String newWord = new String("madam");
        System.out.println(isPalindrome(newWord));
    }
}
