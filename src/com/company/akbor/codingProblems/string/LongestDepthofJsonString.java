package com.company.akbor.codingProblems.string;

public class LongestDepthofJsonString {
    public static int levelCount(String word) {
        int currmax = 0;
        int max = 0;
        int length = word.length();

        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == '{') {
                currmax++;
                if (currmax > max) {
                    max = currmax;
                }
            } else if (word.charAt(i) == '}') {
                if (currmax > 0) {
                    currmax--;
                } else {
                    return -1;
                }
            }
        }
        if (currmax != 0) {
            return -1;
        }

        return max;
    }

    public static void main(String[] args) {
        String word = "{\"0\":{\"name\":\"John\"},\"1\":{\"name\":\"micheal\"}}";
        System.out.println(levelCount(word));
    }
}
