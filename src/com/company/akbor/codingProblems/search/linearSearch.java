package com.company.akbor.codingProblems.search;

public class linearSearch {

    public static int Search(char[] c, char target) {
        for (int i = 0; i < c.length; i++) {
            if (target == c[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String sentence = "My Name is Akbor";
        /*
         * System.out.println(sentence..replace(" ", "").toLowerCase().toCharArray());
         * System.out.println(sentence);
         * */

        int index = Search(sentence.toLowerCase().toCharArray(), 'n');
        System.out.println(index);
    }
}
