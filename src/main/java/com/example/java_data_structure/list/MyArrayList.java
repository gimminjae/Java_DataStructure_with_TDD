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
}
