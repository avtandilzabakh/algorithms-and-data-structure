package com.company.algoritms;

import java.util.HashMap;
import java.util.Map;

public class CountingSort {
    public static void sort(int[] array,int max){
        int[] counts = new int[max+1];
        for (int i : array) {
            counts[i]++;
        }
        int k = 0;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
array[k++] = i;
            }
        }
    }
}
