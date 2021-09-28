package com.company.dataStructure.javaArray;

public class Array {
    int arr[];
    private int count;
    private int size = 0;

    Array(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        return this.arr.length == 0;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(this.arr[i] + " ");
        }
    }

    public void push(int num) {
        if (count != size) {
            this.arr[count] = num;
            count++;
        } else {
            System.out.println(num + " can't be inserted : index out of bound");
        }

    }

    public void pop() {
        if (!isEmpty()) {
            int arrcpy[] = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                arrcpy[i] = arr[i];
            }
            arr = arrcpy;
            this.size = arr.length;
            count--;
        } else {
            System.out.println("array is empty");
        }
    }

    public int indexOf(int n) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.arr.length;
    }

}
