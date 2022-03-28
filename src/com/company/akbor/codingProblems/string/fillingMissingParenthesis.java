package com.company.akbor.codingProblems.string;

public class fillingMissingParenthesis {
    public static int fillMissingParenthesis(String s) {
        int ways = 0;
        if (s.length() <2) return 0;



        return ways;
    }
    public static void main(String[] args) {
        String s = "[[{?]][[";

        int ways = fillMissingParenthesis(s);
        System.out.println(ways);
    }
}
