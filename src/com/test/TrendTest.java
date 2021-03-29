package com.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.company.Trend;

public class TrendTest {

	static final boolean print = false;


	//tests for rising and stable arrays
	@Test
	public void testTrendRisingWithNoValue() {
		int[] array = null;
		testRising(array, false);
		testRisingOrStable(array, false);
	}

	@Test
	public void testTrendRisingWithOneValue() {
		int[] array = {1};
		testRising(array, true);
		testRisingOrStable(array, true);
	}

	@Test
	public void testTrendRisingNegativeValues() {
		int[] array = {-10, -8, -6, -4, -2, 0, 2, 4, 5, 7, 11};
		testRising(array, true);
		testRisingOrStable(array, true);
	}

	@Test
	public void testTrendRisingOrStableNegativeValues() {
		int[] array = {-10, -8, -6, -4, -4, 0, 2, 4, 5, 7, 11};
		testRising(array, false);
		testRisingOrStable(array, true);
	}

	@Test
	public void testTrendNotRisingOrStableNegativeValues() {
		int[] array = {-10, -8, -6, -4, -4, 0, -2, 4, 5, 7, 11};
		testRising(array, false);
		testRisingOrStable(array, false);
	}



	@Test
	public void testTrendRising() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		testRising(array, true);
		testRisingOrStable(array, true);
	}

	@Test
	public void testTrendRisingOrStable() {
		int[] array = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 11, 11, 11};
		testRising(array, false);
		testRisingOrStable(array, true);
	}

	@Test
	public void testTrendRisingOrStable1() {
		int[] array = {1, 1, 3, 4, 5, 6, 8, 8, 9, 10, 11, 11, 11, 11};
		testRising(array, false);
		testRisingOrStable(array, true);
	}

	@Test
	public void testTrendNotRisingOrStable() {
		int[] array = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 10, 11};
		testRising(array, false);
		testRisingOrStable(array, false);
	}

	@Test
	public void testTrendNotRisingOrStable1() {
		int[] array = {1, 2, 1, 4, 5, 6, 8, 8, 9, 10, 11, 11, 11, 11};
		testRising(array, false);
		testRisingOrStable(array, false);
	}


	//tests for lowering and stable arrays
	@Test
	public void testTrendLoweringWithNoValue() {
		int[] array = null;
		testLowering(array, false);
		testLoweringOrStable(array, false);
	}

	@Test
	public void testTrendLoweringWithOneValue() {
		int[] array = {0};
		testLowering(array, true);
		testLoweringOrStable(array, true);
	}

	@Test
	public void testTrendLowering() {
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		testLowering(array, true);
		testLoweringOrStable(array, true);
	}

	@Test
	public void testTrendLoweringOrStable() {
		int[] array = {10, 10, 8, 7, 6, 5, 4, 3, 3, 1, 0, 0};
		testLowering(array, false);
		testLoweringOrStable(array, true);
	}


	@Test
	public void testTrendNotLoweringOrStable() {
		int[] array = {10, 10, 8, 7, 6, 5, 4, 3, 4, 1, 0, 0};
		testLowering(array, false);
		testLoweringOrStable(array, false);
	}

	@Test
	public void testTrendLoweringNegativeValues() {
		int[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11};
		testLowering(array, true);
		testLoweringOrStable(array, true);
	}

	@Test
	public void testTrendLoweringOrStableNegativeValues() {
		int[] array = {-1, -2, -3, -4, -5, -6, -8, -8, -9, -10, -11};
		testLowering(array, false);
		testLoweringOrStable(array, true);
	}

	@Test
	public void testTrendNotLoweringOrStableNegativeValues() {
		int[] array = {-1, -2, -3, -4, -5, -6, -8, -10, -9, -10, -11};
		testLowering(array, false);
		testLoweringOrStable(array, false);
	}

	@Test
	public void testTrendNotLoweringOrStable1() {
		int[] array = {10, 11, 8, 7, 6, 5, 4, 3, 4, 1, 0, 0};
		testLowering(array, false);
		testLoweringOrStable(array, false);
	}

	private void testLoweringOrStable(int[] array, boolean isLoweringOrStable) {
		printArray(array);
		assertEquals(isLoweringOrStable, Trend.isLoweringOrStable(array));
	}

	private void testLowering(int[] array, boolean isLowering) {
		printArray(array);
		assertEquals(isLowering, Trend.isLowering(array));
	}

	private void testRisingOrStable(int[] array, boolean isRisingOrStable) {
		printArray(array);
		assertEquals(isRisingOrStable, Trend.isRisingOrStable(array));
	}

	private void testRising(int[] array, boolean isRising) {
		printArray(array);
		assertEquals(isRising, Trend.isRising(array));
	}

	private void printArray(int[] array) {
		if (print) {
			System.out.println(Arrays.toString(array));
		}
	}
}
