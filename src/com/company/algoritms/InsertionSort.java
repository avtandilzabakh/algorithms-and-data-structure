package com.company.algoritms;

public class InsertionSort {
    public static void sort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int current = ints[i];
            int j = i - 1;
            while (j >= 0 && ints[j] > current) {
                ints[j + 1] = ints[j];
                j--;
            }
            ints[j + 1] = current;
        }
    }
}
