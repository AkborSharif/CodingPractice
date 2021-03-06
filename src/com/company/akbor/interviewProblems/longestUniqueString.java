package com.company.akbor.interviewProblems;

import java.util.HashSet;
import java.util.Set;
/*
* Time complexity: O(n) where n is the number of char in the string
* Space Complexity: O(n) ; hashset stores the n number of character
* */
public class longestUniqueString {
    public static int lengthOfUniqueSubstring(String s){
        Set<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;

        if (s.length()==0){
            return 0;
        }

        while (i<s.length()){
            char c = s.charAt(i);
            if (!set.contains(c)){
                set.add(c);
                i++;
                max = Integer.max(max, set.size());
                System.out.println(set);
            }else{
                c = s.charAt(j);
                set.remove(c);
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfUniqueSubstring("adbcacsk"));
    }
}
