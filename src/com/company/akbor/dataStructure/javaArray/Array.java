package com.company.akbor.dataStructure.javaArray;
import java.util.Arrays;

public class Array {
     private int size;
     private int count;

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
               items[count++] = num;
               //System.out.println(count);
          }
     public void delete(int index){

     }
}