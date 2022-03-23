package com.company.akbor.codingProblems.array;

import java.util.ArrayList;
import java.util.List;

public class StateOfTheCell {

    public static List<Integer> stateOfTheCell(int []arr, int days){
        List<Integer>states = new ArrayList<>();
        states.add(0);
        for (int i = 0; i < arr.length; i++) {
            states.add(arr[i]);
        }
        states.add(0);
    while (days!=0) {
        System.out.println("days: " + days);
        System.out.println("##################");

        for (int i = 1; i < arr.length; i++) {
            System.out.println("----------------");
            System.out.println("before: "+ states.get(i - 1));
            System.out.println("After: "+ states.get(i + 1));

            if (states.get(i - 1) == states.get(i + 1)) {
                arr[i-1] = 0;
                System.out.println("inactive: "+  arr[i-1]);
                System.out.println("----------------");
            } else {
                arr[i-1] = 1;
                System.out.println("active: "+  arr[i-1]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            states.set(i+1, arr[i]);
        }
        days--;
    }

        states.remove(0);
        states.remove(states.size()-1);
        return states;
    }
    public static void main(String[] args) {
        int arr [] = {1,0,0,0,0,1,0,0};
        int days = 2;

        System.out.println(stateOfTheCell(arr, days));

    }
}
