package com.company.akbor.codingProblems.array;

import java.util.*;

public class pairSum {
    public static void main(String[] args) {

        int [] arr = {1,9,9,2,3,4,7,3};
        int sum = 10;
        solution(arr, sum);
        pairSumUsingHashMap(arr,sum);

    }
    public static void solution(int[] arr, int sum){
        Set<List<Integer>> sol = new HashSet<>();
        for (int i = 0; i<arr.length-2; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == sum){
                    sol.add(List.of(arr[i], arr[j]));
                }
            }
        }
        System.out.println(sol);
    }

    public static void pairSumUsingHashMap(int[] nums, int target) {
        Set<List<Integer>> sol = new HashSet<>();
        //using HashMap
        if (nums.length > 1) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (!map.containsKey(complement)) {
                    map.put(nums[i], i);
                } else {
                   sol.add(List.of(nums[map.get(complement)], nums[i]));
                }
            }
            System.out.println(sol);
        }

    }
}
