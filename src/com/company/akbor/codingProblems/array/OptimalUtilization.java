package com.company.akbor.codingProblems.array;

import java.util.*;

public class OptimalUtilization {


    private static List<int[]> getOptimizedPairs(int[][] a, int[][] b, int target) {

        //Creating a TreeMap with key as the sum and value as list of index pairs
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int[] ids = {a[i][0], b[j][0]};
                int value = a[i][1] + b[j][1];
                map.putIfAbsent(value, new ArrayList<>());
                map.get(value).add(ids);
            }
        }

        //Since the TreeMap is sorted, we would iterate over it until we receive a value greater than the target.
        //We will be storing the prev value as that will the answer once we reach a value greater than the target.
        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, List<int[]>> current : map.entrySet()) {
            if (current.getKey() > target) {
                break;
            }
            result = current.getValue();
        }

        return result;
    }

    public static void main(String[] args) {
//        int[][] a = {{1, 3}, {2, 5}, {3, 7}, {4, 10}};
//        int[][] b = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
//        int target = 10;

        int[][] a = {{1, 2}, {2, 4}, {3, 6}};
        int[][] b = {{1, 2}};
        int target = 7;


        List<int[]> result = getOptimizedPairs(a, b, target);
        result.forEach(array -> System.out.println(Arrays.toString(array)));

    }

}