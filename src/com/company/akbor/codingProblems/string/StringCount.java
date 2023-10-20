package com.company.akbor.codingProblems.string;

import java.util.HashMap;

public class StringCount {
    public static void main(String[] args) {
        String s = "This is is interview for for for trading role";
        String []sArray = s.split(" ");
        HashMap<String , Integer> sol = new HashMap<>();

        for(String s1 : sArray){
            if (!sol.containsKey(s1)){
                sol.put(s1, 1);
            }else{
                sol.put(s1, sol.get(s1)+1);
            }
        }

        System.out.println(sol);
    }
}
