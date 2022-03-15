package com.company.akbor.dataStructure.javaArray;
import java.util.Arrays;

public class Array {
     private int size;
     private int count = 0;

     private int[] items;

     public Array(int size) {
          this.size = size;
          items = new int[this.size];
     }

     public void print() {
          if (count > 0) {
               System.out.println(Arrays.toString(items));
          }
          else {
               System.out.println("Array is empty");
          }

          }

     public void insert(int num) {
          for (int i = 0; i < count; i++) {
               items[count++] = num;
          }
     }

}