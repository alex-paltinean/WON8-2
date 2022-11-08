package com.fasttrackit.homework;

public class Homework {

    public static void main(String[] args) {
//        System.out.println(sumOfEvenNumbers(11));
        System.out.println(isPalindrome("anam"));
    }


    //2) sum of first n EVEN integers
    public static int sumOfEvenNumbers(int n) {
        // exit condition
        if (n == 2) {
            return 2;
        }
        if (n % 2 != 0) {
            return sumOfEvenNumbers(n - 1);
        }

        // re-entry condition
        return n + sumOfEvenNumbers(n - 2);
    }

//    3) Palindrome: a word that reads the same backwards as forwards, e.g. madam or ana
// - in two modes :
//         3.2) recursive check of first and last letter

    public static boolean isPalindrome(String s) {
        // exit condition
        if (s.length() < 2) {
            return true;
        }

        //re-entry condition
        char leftChar = s.charAt(0);
        char rightChar = s.charAt(s.length() - 1);
        System.out.println("Comparing " + leftChar + " with " + rightChar);
        boolean areExtremitiesEquals = leftChar == rightChar;
        return areExtremitiesEquals && isPalindrome(s.substring(1, s.length() - 1));
    }
}
