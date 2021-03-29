package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        System.out.println("Just double check Hello!");
        int[] array = {9, 8937592, 8437, -12, 463, 0, 123};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Sort.sortFromSmallestToBiggest(array)));

		System.out.println("Is trend rising: " + Trend.isRising(Sort.sortFromSmallestToBiggest(array)));
		System.out.println("Is trend lowering: " + Trend.isLowering(Sort.sortFromSmallestToBiggest(array)));
		int[] array1 = {-12, -12, -12, -12, -12, -12, -12};
		System.out.println("Is trend rising or stable: " + Trend.isRisingOrStable(array1));
		System.out.println("Is trend lowering or stable: " + Trend.isLoweringOrStable(array1));
    }

}
