package com.sparta.mm.palindrome;

public class LongestPalindrome {
    public static String longestPalindrome(String sentence) {
        String[] splitSentence = sentence.split(" ");
        String lngPalindrome = "";
        for (String item : splitSentence) {
            if (PalindromeCheck.isPalindrome(item) && lngPalindrome.length() < item.length()) {
                lngPalindrome = item;
            }
        }if (lngPalindrome.length() <3) {
            return "There was no Palindrome";
        }
        if (lngPalindrome.isEmpty()){
            return "There was no Palindrome";
        }
        return lngPalindrome;
    }

    public static void main (String[]args){
        String newSentence = "Madam Arora loves to teach Malayalam";
        System.out.println(longestPalindrome(newSentence));
    }
}
