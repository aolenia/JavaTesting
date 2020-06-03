package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        int[] array = {9, 8937592, 8437, -12, 463, 0, 123};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Sort.sortFromSmallestToBiggest(array)));
    }
}
