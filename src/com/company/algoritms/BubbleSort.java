package com.company.algoritms;

public class BubbleSort {
    public static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j]<nums[j-1]){
                    int item = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = item;
                }
            }
        }

    }
}
