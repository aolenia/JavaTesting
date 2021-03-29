package com.company;

public class Trend {

	//This static method returns boolean value if the Trend of int array is rising or stable
	public static boolean isRisingOrStable(int[] array) {
		if (array == null) {
			return false;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	//This static method returns boolean value if the Trend of int array is rising
	public static boolean isRising(int[] array) {
		if (array == null) {
			return false;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >= array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	//This static method returns boolean value if the Trend of int array is lowering or stable
	public static boolean isLoweringOrStable(int[] array) {
		if (array == null) {
			return false;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	//This static method returns boolean value if the Trend of int array is lowering
	public static boolean isLowering(int[] array) {
		if (array == null) {
			return false;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] <= array[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
