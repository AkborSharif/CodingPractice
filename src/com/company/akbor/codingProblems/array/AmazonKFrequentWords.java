package com.company.akbor.codingProblems.array;

import java.util.*;

public class AmazonKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        System.out.println(words.toString());
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word:words) {
            if (map.containsKey(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println(map);
        PriorityQueue<String> pq = new PriorityQueue<>((word1, word2) -> {
            if(map.get(word1) == map.get(word2)) return word2.compareTo(word1);
            return map.get(word1) - map.get(word2);
        });

        for (Map.Entry<String, Integer>entry: map.entrySet()){
            pq.add(entry.getKey());
            if (pq.size()>k) pq.poll();
        }
        while (!pq.isEmpty()) result.add(pq.poll());
        Collections.reverse(result);
//        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String [] words = {"I", "love", "to", "I", "love", "coding"};
        System.out.println(topKFrequent(words, 2));
    }
}
