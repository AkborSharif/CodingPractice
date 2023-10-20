package com.company.akbor.codingProblems.string;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatedSring {
    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();

        while (i < s.length()) {
            Character c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                i++;
                max = Math.max(set.size(), max);
                System.out.println(set + "  Max: "+ max);
            } else {
                c = s.charAt(j);
                set.remove(c);
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbdabcd"));
    }
}
