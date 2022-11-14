package com.example.java_data_structure.list;

public class MyArrayList {
    private int[] array;
    private long size;
    private int lastIndex;

    public MyArrayList() {
        array = new int[10];
        size = 0;
        lastIndex = 0;
    }

    public int get(int n) {
        return array[n];
    }

    public void add(int n) {
        array[lastIndex] = n;
        lastIndex++;
    }
    public void add(int index, int element) {
        for(int i = index; i < array.length - 1; i++) {
            array[i+1] = array[i];
        }
        array[index] = element;
        lastIndex++;
    }
}
