package com.test;

import com.company.Sort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortTest {

    @Test
    public void testSort1() {
        Sort sort = new Sort();
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] sortedArray = sort.sortFromSmallestToBiggest(array);
        Arrays.sort(array);
        validateArrays(array, sortedArray);
    }

    @Test
    public void testSort2() {
        Sort sort = new Sort();
        int[] array = {3, 8, 5, 1, 1, 0, 0};
        int[] sortedArray = sort.sortFromSmallestToBiggest(array);
        Arrays.sort(array);
        validateArrays(array, sortedArray);
    }

    @Test
    public void testSort3() {
        Sort sort = new Sort();
        int[] array = {3, 8, 5, 1, 1, 0, 0};
        int[] sortedArray = sort.sortFromBiggestToSmallest(array);
        Arrays.sort(array);
        reverse(array);
        validateArrays(array, sortedArray);
    }

    @Test
    public void testSortAscendingRandom() {
        int[] array = new int[(int) (100 * Math.random())];
        setRandomsToIntArray(array);
        int[] sortedArray = Sort.sortFromSmallestToBiggest(array);
        Arrays.sort(array);
        validateArrays(array, sortedArray);
    }

    @Test
    public void testSortAscendingRandomWithNegativeInts() {
        int[] array = new int[(int) (100 * Math.random())];
        setNegativeRandomsToIntArray(array);
        int[] sortedArray = Sort.sortFromSmallestToBiggest(array);
        Arrays.sort(array);
        validateArrays(array, sortedArray);
    }

    @Test
    public void testSortDescendingRandom() {
        int[] array = new int[(int) (100 * Math.random())];
        setRandomsToIntArray(array);
        int[] sortedArray = Sort.sortFromBiggestToSmallest(array);
        Arrays.sort(array);
        reverse(array);
        validateArrays(array, sortedArray);
    }

    @Test
    public void testSortDescendingRandomWithNegativeInts() {
        int[] array = new int[(int) (100 * Math.random())];
        setNegativeRandomsToIntArray(array);
//        printArray(array);
        int[] sortedArray = Sort.sortFromBiggestToSmallest(array);
        Arrays.sort(array);
        reverse(array);
//        printArray(array);
//        printArray(sortedArray);
        validateArrays(array, sortedArray);
    }

    @Test
    public void testSortAscendingNull() {
        int[] array = null;
        int[] sortedArray = Sort.sortFromBiggestToSmallest(array);
    }

    @Test
    public void testSortDescendingNull() {
        int[] array = null;
        int[] sortedArray = Sort.sortFromSmallestToBiggest(array);
    }

    @Test
    public void testAscendingLenghtOne() {
        int[] array = new int[1];
        setRandomsToIntArray(array);
        int[] sortedArray = Sort.sortFromSmallestToBiggest(array);
        Arrays.sort(array);
        validateArrays(array, sortedArray);
    }

    @Test
    public void testDescendingLenghtOne() {
        int[] array = new int[1];
        setRandomsToIntArray(array);
        int[] sortedArray = Sort.sortFromBiggestToSmallest(array);
        Arrays.sort(array);
        reverse(array);
        validateArrays(array, sortedArray);
    }


    private void setRandomsToIntArray(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (100 * Math.random());
        }
    }

    private void setNegativeRandomsToIntArray(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }


    private static void reverse(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    private void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private void validateArrays(int[] array1, int[] array2) {
        assertTrue( array1.length == array2.length, "The lenght of arrays are not equal");
        //for loop for asserts
        for (int i = 0; i < array1.length; i++) {
            assertTrue(array1[i] == array2[i], "The value of index:" + i + " is not matching");
        }

    }

}
