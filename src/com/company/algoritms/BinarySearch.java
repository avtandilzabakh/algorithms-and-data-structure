package com.company.algoritms;

public class BinarySearch {
    public int searchRecursion(int[] array, int target) {
        return searchRecursion(array, target, 0, array.length - 1);
    }

    private int searchRecursion(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == target) {
            return middle;
        }
        if (array[middle] > target) {
            return searchRecursion(array, target, left, middle - 1);
        }
            return searchRecursion(array, target, middle + 1, right);

    }


    public int search(int[] array,int target){
        int left =0;
        int right =array.length -1;

        while (left <= right){
            int middle =(left+right) /2;

            if (array[middle] == target){
                return middle;
            }
            if (array[middle] < target){
                left =middle+1;
            }
            if (array[middle] > target){
                right =middle-1;
            }
        }
        return -1;
    }
}
