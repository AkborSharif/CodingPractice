package com.company.akbor.codingProblems.string;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        reverseString(new char[]{'a', 'k', 'b', 'o', 'r'});
        reverseString(new char[]{'L', 'o', 'v', 'e'});
    }
}
