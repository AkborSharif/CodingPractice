package com.company.akbor.codingProblems.string;

public class LongestPalindromicString {

    /*    public static boolean isPalindrom(String s) {
            int i = 0;
            int j = s.length() - 1;
            if (s.length() < 2) {
                return true;
            }
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
            return true;
        }

        public static String longestPalindrome(String s) {
            int max = Integer.MIN_VALUE;
            String output = "";
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String sub = s.substring(i, j);
                    //System.out.println(sub);
                    if (isPalindrom(sub) && max < sub.length()) {
                        output = sub;
                        max = sub.length();
                    }
                }
            }
            return output;
        }
        */
    static int resultStart, resultLength;

    public static void expanFromdMiddle(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength <= end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expanFromdMiddle(s, i, i);
            expanFromdMiddle(s, i, i + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    public static void main(String[] args) {
        String s = "babbad";
        s = "bbaabb";
        System.out.println(longestPalindrome(s));
    }
}
