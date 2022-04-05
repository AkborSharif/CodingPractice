package com.company.akbor.interviewProblems;

public class palindromicPermutation {
    public static boolean canPermutePalindrome(String s){
        /*
         * 128 is the total number of ascii
         * Time complexity: O(n) where n is the number of char in the string
         * Space Complexity: O(1) ; int array stores 128 chars
         *
         * 1. we are counting the occurrence of characters in the string in char_count array
         * 2. we are looping through the array and adding the char_count[i]%2 so if
         * at the end the count is 0 0r 1 we have a palindromic string in the permutation
         * 3. if the count is even that means there is 2 or more unmatched character so cannot be a palindrome
         * */

        int[]char_count = new int[128];



        for (int i = 0; i < s.length(); i++) {
            char_count[s.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < char_count.length; i++) {
            if (char_count[i]!=0) {
                count += char_count[i] % 2;
                System.out.println(char_count[i] % 2);
            }
        }

        return count <=1;
    }
    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("dddddvvv"));
    }
}
