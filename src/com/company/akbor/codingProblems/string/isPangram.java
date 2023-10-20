package com.company.akbor.codingProblems.string;

public class isPangram {
    public static boolean isPangram(String s){
        int [] count = new int[26];
        s = s.toUpperCase();

        for (int k = 0; k <s.length(); k++) {
            char c = s.charAt(k);
            if (c!= ' ') {
                count[c-65]++;
            }
        }

        for (int i = 0; i <count.length; i++) {
            if (count[i] == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "Bbe quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s));

        System.out.println((char)65);
    }
}
