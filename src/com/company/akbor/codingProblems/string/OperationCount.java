package com.company.akbor.codingProblems.string;

public class Random {
    private static int operationCount(String word, int input1, int input2) {
        String oword = word;
        String cword = word;
        /*write your code here and return appropriate value*/
        int count = 0;
        while (true) {
            String john = cword.substring(cword.length() - input1);
            cword = john + cword.substring(0, cword.length() - input1);
            count++;
            if (cword.equals(oword)) {
                break;
            }
            String mich = cword.substring(cword.length() - input2);
            cword = mich + cword.substring(0, cword.length() - input2);
            count++;
            if (oword.equals(cword)) {
                break;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        // System.out.println(operationCount("abcabc", 1, 1));

        String word = "{\"0\":{\"name\":\"John\"},\"1\":{\"name\":\"micheal\"}}";
        
    }
}
