package com.company.akbor.codingProblems.number;

import java.util.ArrayList;
import java.util.List;

public class GCD {

    public static int gcdHelper(int a, int b){
        if (a==0) return b;
        if(b==0) return a;
        return gcdHelper(b, a%b);
    }

    public static int greatCommonDivisor(int [] nums){
        int temp = nums[0];
        for (int i = 1; i < nums.length-1; i++) {
            temp = gcdHelper(nums[i], temp);
        }
        return temp;
    }
    public static void main(String[] args) {
        int [] nums = {3,6,9};
       int gcd =  greatCommonDivisor(nums);
        System.out.println(gcd);


        List<String> name = new ArrayList<>();
        name.add("akbor");
        name.add("akbor");
        name.add("newaz");
        name.add("newaz");

        System.out.print(name.indexOf("newazst"));
    }
}
