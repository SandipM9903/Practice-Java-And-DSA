package test.array;

import org.junit.jupiter.api.Test;
import programs.array.SoloSum2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SoloSumTest2 {
    SoloSum2 solution = new SoloSum2();

    @Test
    void testSampleInput1() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {14, 13, 12, 11, 10};
        assertArrayEquals(expected, solution.leftRightSum(input));
    }

    @Test
    void testSampleInput2() {
        int[] input = {1, 2, -3, 4, -5};
        int[] expected = {-2, -3, 2, -5, 4};
        assertArrayEquals(expected, solution.leftRightSum(input));
    }

    @Test
    void testSingleElement() {
        int[] input = {100};
        int[] expected = {0};
        assertArrayEquals(expected, solution.leftRightSum(input));
    }

    @Test
    void testAllZeros() {
        int[] input = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, solution.leftRightSum(input));
    }

    @Test
    void testNegativeNumbersOnly() {
        int[] input = {-1, -2, -3};
        int[] expected = {-5, -4, -3};
        assertArrayEquals(expected, solution.leftRightSum(input));
    }

    @Test
    void testLargeValues() {
        int[] input = {1000, 2000, 3000};
        int[] expected = {5000, 4000, 3000};
        assertArrayEquals(expected, solution.leftRightSum(input));
    }
}
