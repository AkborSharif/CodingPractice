package com.company.akbor.codingProblems.number;

public class PalindromNumber {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        if (x < 0) {
            return false;
        } else {
            int v = x;
            while (v != 0) {
                int pop = v % 10;
                v /= 10;
                rev = rev * 10 + pop;
            }
        }
        return rev == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(-11));
    }
}
