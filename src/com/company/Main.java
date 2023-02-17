package com.company;

import com.company.algoritms.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();
        TernarySearch ternarySearch = new TernarySearch();
        int[] ints = new int[]{1,3,4,5,7,8};
        System.out.println(ternarySearch.search(ints,4));

    }

}
