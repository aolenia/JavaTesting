package com.company;

public class TrendSolver {

	public static Trend trendSolver(int[] array){
		if (isArrayInvalid(array)) {
			return Trend.INVALID;
		}
		if(isStable(array)){
			return Trend.STABLE;
		}else if(isLoweringOrStable(array)){
			return Trend.LOWERING_AND_STABLE;
		}else if(isRisingOrStable(array)){
			return Trend.RISING_AND_STABLE;
		}else if(isLowering(array)){
			return Trend.LOWERING;
		}else if(isRising(array)){
			return Trend.RISING;
		}else{
			return Trend.FLUCTUATING;
		}

	}

	//This static method returns boolean value if the Trend of int array is rising or stable
	private static boolean isRisingOrStable(int[] array) {
		if (isArrayInvalid(array)) {
			return false;
		}
		//if not really rising, check is it stable and rising
		if(!isRising(array)){
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					return false;
				}
			}
			return true;
		}
		return false;

	}

	//This static method returns boolean value if the Trend of int array is rising
	private static boolean isRising(int[] array) {
		if (isArrayInvalid(array)) {
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
	private static boolean isLoweringOrStable(int[] array) {
		if (isArrayInvalid(array)) {
			return false;
		}

		//if not really lowering, check is it stable and lowering
		if(!isLowering(array)){
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					return false;
				}
			}
			return true;
		}
		return false;

	}

	//This static method returns boolean value if the Trend of int array is lowering
	private static boolean isLowering(int[] array) {
		if (isArrayInvalid(array)) {
			return false;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] <= array[i + 1]) {
				return false;
			}
		}
		return true;
	}
	//This static method returns boolean value if the Trend of int array is stable
	private static boolean isStable(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private static boolean isArrayInvalid(int[] array){
		if (array == null || array.length <= 1) {
			return true;
		}
		return false;
	}
}
