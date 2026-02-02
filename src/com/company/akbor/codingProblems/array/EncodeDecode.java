package com.company.akbor.codingProblems.array;

import java.util.ArrayList;
import java.util.List;

class EncodeDecode {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        StringBuilder len = new StringBuilder();
        StringBuilder word = new StringBuilder();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                len.append(str.charAt(i));
            } else {
                i++;
                int wordLen = Integer.parseInt(len.toString());
                int endLen = i + wordLen;
                while (i < endLen) {
                    word.append(str.charAt(i));
                    i++;
                }
                res.add(word.toString());
                i--;
                len = new StringBuilder();
                word = new StringBuilder();
            }


        }
        return res;
    }
}
