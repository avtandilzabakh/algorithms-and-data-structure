package com.company.algoritms;

public class SelectionSort {
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int item = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = item;
        }
    }
}
