package com.company.akbor.codingProblems.array;

import java.util.*;
import java.util.stream.Collectors;

public class AmazonKFrequentWords {
//    public static List<String> topKFrequent(String[] words, int k) {
//        for (String w:words) {
//            System.out.print(w+ " ");
//        }
//        List<String> result = new ArrayList<>();
//        Map<String, Integer> map = new HashMap<>();
//        for (String word:words) {
//            if (map.containsKey(word)) {
//                map.put(word, map.getOrDefault(word, 0) + 1);
//            }
//        }
//
//        PriorityQueue<String> pq = new PriorityQueue<>((word1, word2) -> {
//            if(map.get(word1) == map.get(word2)) return word2.compareTo(word1);
//            return map.get(word1) - map.get(word2);
//        });
//
//        for (Map.Entry<String, Integer>entry: map.entrySet()){
//           System.out.println(entry.getKey());
//            pq.add(entry.getKey());
//            if (pq.size()>k) pq.poll();
//        }
//        while (!pq.isEmpty()) result.add(pq.poll());
//        Collections.reverse(result);
////        System.out.println(result);
//        return result;
//    }

//    TreeMap takes log(n) time to insert a key, unlike HashMap which takes O(1)
//
//    Space Complexity: O(n)
//    As we maintain a frequency map.

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new TreeMap<>();

        for(String word : words) {
            map.compute(word, (key, val) -> val == null ? 1 : ++val);
        }

       for(String word: map.keySet()){
           System.out.println(word +" -> "+map.get(word));
       }
        return map.keySet().stream()
                .sorted((a, b) -> Integer.compare(map.get(b), map.get(a)))
                .limit(k)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        String [] words = {"I", "love", "to", "I", "love", "coding"};
        System.out.println(topKFrequent(words, 3));



        List.of(1,2,1,2,3,24,12,21).stream().sorted((a,b)->Integer.compare(a,b)).forEach(System.out::println);

        //System.out.println(Integer.compare(2,1));
    }
}
