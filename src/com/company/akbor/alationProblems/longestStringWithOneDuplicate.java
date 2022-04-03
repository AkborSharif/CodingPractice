package com.company.akbor.alationProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class longestStringWithOneDuplicate {
    public static int maxLength(String s){
        int max = Integer.MIN_VALUE;
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int l = 100000000;
        while(i<s.length()){

            char c = s.charAt(i);
            if (l!=i) {
                map.compute(c, (key, val) -> val == null ? 1 : ++val);
            }
            int numberOfDuplicate = map.values().stream()
                    .filter(k->k>1)
                    .collect(Collectors.toList())
                    .size();

            if (numberOfDuplicate<2){
                list.add(c);
//                System.out.println("added: " + c);
//                System.out.println("ListAfterAdd:"+ list);
                max = Math.max(max, list.size());
                i++;
            }
            else{
                char remValue = list.remove(j);
//                System.out.println("rmoved: " + remValue);
//                System.out.println("ListAfterRemove:"+ list);
                if (map.get(remValue)>0) {
                    map.put(remValue, map.get(remValue) - 1);
                }
                l = i;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxLength("abcaaabbbbbb"));

        }

}
