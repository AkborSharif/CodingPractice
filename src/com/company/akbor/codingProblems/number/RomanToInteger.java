package com.company.akbor.codingProblems.number;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int number = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int i = 0;
        while (i < s.length()) {
            char curr = s.charAt(i);
            int currNum = roman.get(curr);
            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);
                int nextNum = roman.get(next);
                if (currNum >= nextNum) {
                    number += currNum;
                } else {
                    number += nextNum - currNum;
                    i++;
                }

            } else {
                number += currNum;
            }

            //  System.out.println(number);
            i++;
        }
        return number;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("LVIII"));
    }

}
