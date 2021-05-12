package com.test;

import com.company.Trend;
import com.company.TrendSolver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrendSolverTest {

	static final boolean print = false;

	//tests for rising and stable arrays
	@Test
	public void testTrendWithNoValue() {
		int[] array = null;
		assertEquals(Trend.INVALID,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendWithOneValue() {
		int[] array = {1};
		assertEquals(Trend.INVALID,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendRisingNegativeValues() {
		int[] array = {-10, -8, -6, -4, -2, 0, 2, 4, 5, 7, 11};
		assertEquals(Trend.RISING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendRisingOrStableNegativeValues() {
		int[] array = {-10, -8, -6, -4, -4, 0, 2, 4, 5, 7, 11};
		assertEquals(Trend.RISING_AND_STABLE,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendNotRisingOrStableNegativeValues() {
		int[] array = {-10, -8, -6, -4, -4, 0, -2, 4, 5, 7, 11};
		assertEquals(Trend.FLUCTUATING,  TrendSolver.trendSolver(array));
	}


	@Test
	public void testTrendRising() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		assertEquals(Trend.RISING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendRisingOrStable() {
		int[] array = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 11, 11, 11};
		assertEquals(Trend.RISING_AND_STABLE,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendRisingOrStable1() {
		int[] array = {1, 1, 3, 4, 5, 6, 8, 8, 9, 10, 11, 11, 11, 11};
		assertEquals(Trend.RISING_AND_STABLE,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendNotRisingOrStable() {
		int[] array = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 10, 11};
		assertEquals(Trend.FLUCTUATING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendNotRisingOrStable1() {
		int[] array = {1, 2, 1, 4, 5, 6, 8, 8, 9, 10, 11, 11, 11, 11};
		assertEquals(Trend.FLUCTUATING,  TrendSolver.trendSolver(array));
	}


	//tests for lowering and stable arrays
	@Test
	public void testTrendLoweringWithNoValue() {
		int[] array = null;
		assertEquals(Trend.INVALID,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendLoweringWithOneValue() {
		int[] array = {0};
		assertEquals(Trend.INVALID,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendLowering() {
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		assertEquals(Trend.LOWERING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendLoweringOrStable() {
		int[] array = {10, 10, 8, 7, 6, 5, 4, 3, 3, 1, 0, 0};
		assertEquals(Trend.LOWERING_AND_STABLE,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendNotLoweringOrStable() {
		int[] array = {10, 10, 8, 7, 6, 5, 4, 3, 4, 1, 0, 0};
		assertEquals(Trend.FLUCTUATING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendLoweringNegativeValues() {
		int[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11};
		assertEquals(Trend.LOWERING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendLoweringOrStableNegativeValues() {
		int[] array = {-1, -2, -3, -4, -5, -6, -8, -8, -9, -10, -11};
		assertEquals(Trend.LOWERING_AND_STABLE,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendNotLoweringOrStableNegativeValues() {
		int[] array = {-1, -2, -3, -4, -5, -6, -8, -10, -9, -10, -11};
		assertEquals(Trend.FLUCTUATING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendNotLoweringOrStable1() {
		int[] array = {10, 11, 8, 7, 6, 5, 4, 3, 4, 1, 0, 0};
		assertEquals(Trend.FLUCTUATING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendStable() {
		int[] array = {10, 11, 8, 7, 6, 5, 4, 3, 4, 1, 0, 0};
		assertEquals(Trend.FLUCTUATING,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendStable1() {
		int[] array = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		assertEquals(Trend.STABLE,  TrendSolver.trendSolver(array));
	}

	@Test
	public void testTrendStableWithOneValue() {
		int[] array = {10};
		assertEquals(Trend.INVALID,  TrendSolver.trendSolver(array));
	}
}
