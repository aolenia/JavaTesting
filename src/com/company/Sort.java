package com.company;

import java.util.Arrays;

public class Sort {

    public static int[] sortFromSmallestToBiggest(int[] array) {
        //bad input, bad output
        if (array == null || array.length <= 1) {
            return array;
        }

        int[] copyArray = Arrays.copyOf(array, array.length);
        int[] returnArray = new int[copyArray.length];
        int index = 0;
        int largest = returnLargestNumberOfArray(copyArray);

        for (int i = 0; i < copyArray.length; i++) {
            index = returnSmallestIndexOfArray(copyArray);
            returnArray[i] = copyArray[index];
            copyArray[index] = largest + 1;
        }

        return returnArray;
    }


    public static int[] sortFromBiggestToSmallest(int[] array) {
        //bad input, bad output
        if (array == null || array.length <= 1) {
            return array;
        }
        int[] copyArray = Arrays.copyOf(array, array.length);
        int[] returnArray = new int[copyArray.length];
        int index = 0;
        int smallest = returnSmallestNumberOfArray(copyArray);

        for (int i = 0; i < copyArray.length; i++) {
            index = returnBiggestIndexOfArray(copyArray);
            returnArray[i] = copyArray[index];
            copyArray[index] = smallest;
        }

        return returnArray;
    }


    private static int returnSmallestIndexOfArray(int[] array) {
        int smallest = returnLargestNumberOfArray(array) + 1;
        int returnIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallest = array[i];
                returnIndex = i;
            }
        }
        return returnIndex;
    }

    private static int returnBiggestIndexOfArray(int[] array) {
        int largest = returnSmallestNumberOfArray(array);
        int returnIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= largest) {
                largest = array[i];
                returnIndex = i;
            }
        }
        return returnIndex;
    }

    private static int returnLargestNumberOfArray(int[] array) {
        int largest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    private static int returnSmallestNumberOfArray(int[] array) {
        int smallest = returnLargestNumberOfArray(array) + 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
