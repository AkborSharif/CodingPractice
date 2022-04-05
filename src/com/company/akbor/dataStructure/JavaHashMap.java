package com.company.akbor.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String s = "aaabbbccsssccc";

        for (char c: s.toCharArray()){
            map.compute(c, (key,val)-> val==null? 1:val++);
        }

        System.out.println(map.keySet() +" " + map.values());
    }
}
