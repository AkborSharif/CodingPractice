package com.company.dataStructure.javaArray;

/*
use of Array in Java
* */
public class Main {
    public static void main(String[] args) {

        //Custom array class
        Array numbers = new Array(4);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        //numbers.push(4);
        numbers.pop();
        //numbers.pop();
        //numbers.pop();
        //numbers.pop();
        //numbers.pop();

        numbers.print();
        System.out.println();
        System.out.println("Index of 2 is " + numbers.indexOf(2));
        System.out.println("Index of 4 is " + numbers.indexOf(4));
/*
        //creating an array
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int arr1[] = new int[8];

        //inserting in an array
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 2;
        }
        System.out.println();
        //printing ar array
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : arr1) {
            System.out.print(n + " ");
        }
        System.out.println();

        //copying an array
        Integer arr2[] = {1, 2, 3, 4, 5, 6, 7};

        Integer arrcpy[] = new Integer[8];
        for (int i = 0; i < arr2.length; i++) {
            arrcpy[i] = arr2[i];
        }

        System.out.print("Copy using for loop: ");
        for (Integer i : arrcpy) {
            System.out.print(i + " ");
        }

        Integer arrcpy1[] = Arrays.copyOf(arr2, 8);
        System.out.print("Copy using Arrays.copyof(): ");
        for (Integer i : arrcpy1) {
            System.out.print(i + " ");
        }*/
    }
}
