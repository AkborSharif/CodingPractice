package com.company.akbor.alationProblems;

import java.util.HashMap;

public class contiguousArray {
    public static int findMaxLength(int[] nums){
        HashMap<Integer, Integer> counts = new HashMap<>();
        counts.put(0,-1);
        int maxLength = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                count --;
            }else{
                count ++;
            }
            if (counts.containsKey(count)){
                maxLength = Math.max(maxLength, i-counts.get(count));
            }else{
                counts.put(count, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        //-1 0
        System.out.println(findMaxLength(new int[]{0,1,0,1}));
    }
}

